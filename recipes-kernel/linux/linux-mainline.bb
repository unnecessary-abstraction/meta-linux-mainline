DESCRIPTION = "Linux kernel (mainline)"
SECTION = "kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

inherit kernel

# The ORC unwinder is enabled in x86_64_defconfig and needs libelf-dev
DEPENDS_append_x86-64 = " elfutils-native"

LINUX_VERSION = "5.9-rc5"
PV = "${LINUX_VERSION}"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/torvalds/linux.git;protocol=https"
SRCREV = "856deb866d16e29bd65952e0289066f6078af773"
S = "${WORKDIR}/git"
