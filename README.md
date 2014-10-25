SuperSecretKey
==============

Android JNI library for keys storage

Description
-----------
* Create a library project.
* Create a .cpp file on a folder named jni.
* Create Android.mk file on the folder jni.
* Important:
Probably the most important detail to pay attention to is the name of the method itself, since it must adhere to the a strict format: “Java” followed by the package name, class name, and then the method name as defined in Java (we haven’t defined the method yet in Java but we will do so below), with every piece separated by an underscore.
* Build: 
Place your terminal on your proyect directory, execute ../../android-ndk-xxx/ndk-build
* Create a folder named libs/armeabi and inside it copy the file .so from the library project, from the obj/local/armeabi directory, created on the build.
* Add the jar file of the library.
* Run your project!!

