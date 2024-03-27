require qt5.inc
require qt5-git.inc

LICENSE = "(LGPL-2.1-only & The-Qt-Company-Qt-LGPL-Exception-1.1 | LGPL-3.0-only)"
LIC_FILES_CHKSUM = " \
    file://LICENSE.LGPLv21;md5=4bfd28363f541b10d9f024181b8df516 \
    file://LICENSE.LGPLv3;md5=e0459b45c5c4840b353141a8bbed91f0 \
    file://LICENSE.GPLv3;md5=88e2b9117e6be406b5ed6ee4ca99a705 \
    file://LGPL_EXCEPTION.txt;md5=9625233da42f9e0ce9d63651a9d97654 \
"

DEPENDS += "qtbase qttools-native"

PACKAGES =. " \
    ${PN}-assistant \
    ${PN}-designer \
    ${PN}-linguist \
    ${PN}-qmlviewer \
    ${PN}-qtconnectivity \
    ${PN}-qtmultimedia \
    ${PN}-qtlocation \
    ${PN}-qtdeclarative \
    ${PN}-qtquickcontrols \
    ${PN}-qtquickcontrols2 \
    ${PN}-qtwebsockets \
    ${PN}-qtwebengine \
    ${PN}-qtxmlpatterns \
    ${PN}-qtconfig \
    ${PN}-qtquick1 \
    ${PN}-qtscript \
    ${PN}-qtserialport \
    ${PN}-qtbase \
    ${PN}-qthelp \
    ${PN}-qt \
"

FILES:${PN}-assistant = " \
    ${OE_QMAKE_PATH_TRANSLATIONS}/assistant_*.qm \
"

FILES:${PN}-designer = " \
    ${OE_QMAKE_PATH_TRANSLATIONS}/designer_*.qm \
"

FILES:${PN}-linguist = " \
    ${OE_QMAKE_PATH_TRANSLATIONS}/linguist_*.qm \
"

FILES:${PN}-qmlviewer = " \
    ${OE_QMAKE_PATH_TRANSLATIONS}/qmlviewer_*.qm \
"

FILES:${PN}-qtconnectivity = " \
    ${OE_QMAKE_PATH_TRANSLATIONS}/qtconnectivity_*.qm \
"

FILES:${PN}-qtmultimedia = " \
    ${OE_QMAKE_PATH_TRANSLATIONS}/qtmultimedia_*.qm \
"

FILES:${PN}-qtlocation = " \
    ${OE_QMAKE_PATH_TRANSLATIONS}/qtlocation_*.qm \
"

FILES:${PN}-qtdeclarative = " \
    ${OE_QMAKE_PATH_TRANSLATIONS}/qtdeclarative_*.qm \
"

FILES:${PN}-qtquickcontrols = " \
    ${OE_QMAKE_PATH_TRANSLATIONS}/qtquickcontrols_*.qm \
"

FILES:${PN}-qtquickcontrols2 = " \
    ${OE_QMAKE_PATH_TRANSLATIONS}/qtquickcontrols2_*.qm \
"

FILES:${PN}-qtwebsockets = " \
    ${OE_QMAKE_PATH_TRANSLATIONS}/qtwebsockets_*.qm \
"

FILES:${PN}-qtwebengine = " \
    ${OE_QMAKE_PATH_TRANSLATIONS}/qtwebengine_*.qm \
"

FILES:${PN}-qtxmlpatterns = " \
    ${OE_QMAKE_PATH_TRANSLATIONS}/qtxmlpatterns_*.qm \
"

FILES:${PN}-qtconfig = " \
    ${OE_QMAKE_PATH_TRANSLATIONS}/qtconfig_*.qm \
"

FILES:${PN}-qtquick1 = " \
    ${OE_QMAKE_PATH_TRANSLATIONS}/qtquick1_*.qm \
"

FILES:${PN}-qtscript = " \
    ${OE_QMAKE_PATH_TRANSLATIONS}/qtscript_*.qm \
"

FILES:${PN}-qtserialport = " \
    ${OE_QMAKE_PATH_TRANSLATIONS}/qtserialport_*.qm \
"

FILES:${PN}-qtbase = " \
    ${OE_QMAKE_PATH_TRANSLATIONS}/qtbase_*.qm \
"

FILES:${PN}-qthelp = " \
    ${OE_QMAKE_PATH_TRANSLATIONS}/qt_help_*.qm \
"

FILES:${PN}-qt = " \
    ${OE_QMAKE_PATH_TRANSLATIONS}/qt_*.qm \
"

SRCREV = "df316bf7e6508ae1360247feb08780a77ea4210e"
