#include "JniMain.h"
#include "jni_md.h"

JNIEXPORT jint JNICALL Java_ch10_1classload_jni_JniMain_say
        (JNIEnv *, jclass, jint i, jint j) {
    return i + j;
}