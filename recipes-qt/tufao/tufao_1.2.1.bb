SUMMARY = "An asynchronous web framework for C++ built on top of Qt"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=4fbd65380cdd255951079008b364516c"
DEPENDS = "qtbase"

SRCREV = "a4832b4c941b5ff3f5fab23adcff39e6ad6cb4e5"
SRC_URI = "git://github.com/vinipsmaker/tufao.git;protocol=https;branch=master \
           file://build-Fix-mkspecs-and-CMake-module-install-directori.patch"

# This includes bugfixes from 1.x branch
PV:append = "+${SRCPV}"

S = "${WORKDIR}/git"

inherit cmake_qt5

PACKAGES += "${PN}-mkspecs"

FILES:${PN}-mkspecs = "\
    ${OE_QMAKE_PATH_QT_ARCHDATA}/mkspecs \
"

FILES:${PN}-dev += " \
    ${OE_QMAKE_PATH_LIBS}/lib*${SOLIBSDEV} \
    ${OE_QMAKE_PATH_LIBS}/pkgconfig \
    ${OE_QMAKE_PATH_LIBS}/cmake/* \
    ${OE_QMAKE_PATH_LIBS}/*.prl \
    ${OE_QMAKE_PATH_LIBS}/*.la \
    ${OE_QMAKE_PATH_DATA}/* \
    ${OE_QMAKE_PATH_HEADERS}/* \
"
