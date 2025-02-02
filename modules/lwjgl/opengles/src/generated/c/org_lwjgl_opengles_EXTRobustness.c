/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef jint (APIENTRY *glGetGraphicsResetStatusEXTPROC) (void);
typedef void (APIENTRY *glReadnPixelsEXTPROC) (jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnUniformfvEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnUniformivEXTPROC) (jint, jint, jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_EXTRobustness_glGetGraphicsResetStatusEXT(JNIEnv *__env, jclass clazz) {
    glGetGraphicsResetStatusEXTPROC glGetGraphicsResetStatusEXT = (glGetGraphicsResetStatusEXTPROC)tlsGetFunction(479);
    UNUSED_PARAM(clazz)
    return glGetGraphicsResetStatusEXT();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTRobustness_nglReadnPixelsEXT__IIIIIIIJ(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height, jint format, jint type, jint bufSize, jlong dataAddress) {
    glReadnPixelsEXTPROC glReadnPixelsEXT = (glReadnPixelsEXTPROC)tlsGetFunction(480);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glReadnPixelsEXT(x, y, width, height, format, type, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTRobustness_nglGetnUniformfvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress) {
    glGetnUniformfvEXTPROC glGetnUniformfvEXT = (glGetnUniformfvEXTPROC)tlsGetFunction(481);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetnUniformfvEXT(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTRobustness_nglGetnUniformivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress) {
    glGetnUniformivEXTPROC glGetnUniformivEXT = (glGetnUniformivEXTPROC)tlsGetFunction(482);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetnUniformivEXT(program, location, bufSize, params);
}

EXTERN_C_EXIT
