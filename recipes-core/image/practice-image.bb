SUMMARY = "A very small image for yocto test"

inherit practice-base-image

LINGUAS_KO_KR = "ko-kr"
LINGUAS_EN_US = "en-us"
IMAGE_LINGUAS = "${LINGUAS_KO_KR} ${LINGUAS_EN_US}"
IMAGE_INSTALL += "packagegroup-practice"
IMAGE_OVERHEAD_FACTOR = "1.3"

inherit extrausers

EXTRA_USERS_PARAMS = "\
    groupadd practicegroup; \
    useradd -p '$(openssl passwd -6 9876)' -g practicegroup practice; \
    "
