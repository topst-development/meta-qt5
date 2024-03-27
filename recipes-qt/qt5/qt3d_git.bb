require qt5.inc
require qt5-git.inc

LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSE.LGPLv3;md5=8211fde12cc8a4e2477602f5953f5b71 \
    file://LICENSE.GPLv3;md5=88e2b9117e6be406b5ed6ee4ca99a705 \
    file://LICENSE.GPL;md5=c96076271561b0e3785dad260634eaa8 \
"

DEPENDS += "qtbase"
DEPENDS:class-target += "qtdeclarative qt3d-native"

SRC_URI += " \
    file://0001-Allow-a-tools-only-build.patch \
"

PACKAGECONFIG ??= ""
PACKAGECONFIG:class-native ??= "tools-only"
PACKAGECONFIG:class-nativesdk ??= "tools-only"
PACKAGECONFIG[tools-only] = "CONFIG+=tools-only"

EXTRA_QMAKEVARS_PRE += "${PACKAGECONFIG_CONFARGS}"

FILES:${PN}-qmlplugins += " \
    ${OE_QMAKE_PATH_QML}/*/*/*.bez \
    ${OE_QMAKE_PATH_QML}/*/*/*.obj \
"

SRCREV = "fc781fa42287a4f5db62a346ad6eb8bcbb9f49c0"

BBCLASSEXTEND += "native nativesdk"
