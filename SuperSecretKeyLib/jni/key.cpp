#include <string.h>
#include <jni.h>
extern "C" {
	JNIEXPORT jstring JNICALL
	Java_r2b_apps_lib_supersecretkey_SuperSecretKey_getKey(JNIEnv *env, jobject obj)
	{
		return env->NewStringUTF("Hello from C++ over JNI!");
	}
}
