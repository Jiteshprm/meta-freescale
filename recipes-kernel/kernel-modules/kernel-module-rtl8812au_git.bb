# Copyright (C) 2020 Realtek.

SUMMARY = "Realtek RTL8812AU wireless driver module"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/ISC;md5=f3b90e78ea0cffb20bf5cca7947a896d"

# Reference Realtek RTL8812AU tag/version
PV = "v5.9.3.2+${SRCPV}"

SRCBRANCH = "main"
SRCREV = "89be8e643381f8ae1fb3ec750907c0c0d0962be0"

SRC_URI = "\
    git://github.com/Jiteshprm/rtl8812au-5.9.3.2;protocol=git;branch=${SRCBRANCH} \
"

S = "${WORKDIR}/git"

inherit module

do_compile_prepend() {
    #export BUILD_VER=${PV}
}

do_install_prepend() {

}

do_install_append() {

}

COMPATIBLE_MACHINE = "(imx6dl-riotboard)"
