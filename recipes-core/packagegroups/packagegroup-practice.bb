DESCRIPTION = "this package practice is great's packages"
inherit packagegroup

PACKAGE_ARCH = "${MACHINE_ARCH}"
RDEPENDS:${PN} = "\
    helloworld \
    nano \
    "
