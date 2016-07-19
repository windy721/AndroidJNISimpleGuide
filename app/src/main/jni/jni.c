//
// Created by 55 on 16/7/19.
//

#include "com_jim_androidjnisimpleguide_JNI.h"
#include <jni.h>

JNIEXPORT jstring JNICALL Java_com_jim_androidjnisimpleguide_JNI_getInitStringFromNative(JNIEnv *, jobject) {
    return (*env)->NewStringUTF(env,"JNI: Hello From JNI!");
}

JNIEXPORT jstring JNICALL Java_com_jim_androidjnisimpleguide_JNI_getGreetingFromNative(JNIEnv *, jobject) {
    return (*env)->NewStringUTF(env, "JNI: Greeting From JNI!");
}