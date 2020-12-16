DESCRIPTION = "Linux kernel (mainline)"
SECTION = "kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

inherit kernel

# The ORC unwinder is enabled in x86_64_defconfig and needs libelf-dev
DEPENDS_append_x86-64 = " elfutils-native"

LINUX_VERSION = "5.10"
PV = "${LINUX_VERSION}"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/torvalds/linux.git;protocol=https"
SRCREV = "2c85ebc57b3e1817b6ce1a6b703928e113a90442"
S = "${WORKDIR}/git"
