# In Class Problem Set 3

I used ComboBoxDemo.java a few years ago.  It used to compile cleanly.  Even though the code has not changed, it now  will not compile without throwing warnings.

Doing everything from a command prompt or Git Bash (no IDEs allowed), your mission is to debug the code and find out why it stopped compiling cleanly.  When you have figured it out,  note what you changed and why it stopped working in the README.md file.


**Changes to code**

 **Issue:** The original code declared and instantiated `cBox1` as a raw `JComboBox`, which can cause compilation errors in environments that treat warnings as errors (due to type-safety requirements in newer versions of Java).
 
 **Fix:** Updated the declaration and instantiation to use generics:
   **Before:**
    ```java
    static JComboBox cBox1;
    …
    cBox1 = new JComboBox(s1);
    

   **After:**
    ```java
    static JComboBox<String> cBox1;
    …
    cBox1 = new JComboBox<>(s1);
    ```
  

**What caused it to stop working?**
Using raw types in Java (i.e. not specifying the type parameter) can lead to unchecked conversion warnings. In build setups that treat warnings as errors, this causes the compilation to fail. Parameterized the `JComboBox` resolves the warning and allows the code to compile cleanly.
