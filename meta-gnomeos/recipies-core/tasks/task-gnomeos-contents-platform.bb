#
# Copyright (C) 2011 Colin Walters <walters@verbum.org>
#
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

PACKAGE_ARCH = "${MACHINE_ARCH}"
ALLOW_EMPTY_${PN} = "1"

PR = "1"

RDEPENDS_${PN} += "\
	 util-linux-libuuid \
	 which \
	 libffi \
	 tiff \
	 libjpeg-turbo \
	 libexif \
	 libstdc++ \
	 gnutls \
	 libogg \
	 libssp \
	 glibc-gconvs \
	 glibc-binaries \
	 glibc-localedatas \
	 glibc-charmaps \
	 glibc-utils \
	 glibc-locale \
	 ncurses-terminfo-base \
	 cpio \
	 alsa-lib \
	 cracklib \
	 base-files \
	 base-passwd \
	 update-alternatives-cworth \
	 coreutils \
	 sed \
	 findutils \
	 bash \
	 tar \
	 grep \
	 gawk \
	 gzip \
	 less \
	 curl \
	 tzdata \
	 tzdata-africa \
	 tzdata-americas \
	 tzdata-antarctica \
	 tzdata-arctic \
	 tzdata-asia \
	 tzdata-atlantic \
	 tzdata-australia \
	 tzdata-europe \
	 tzdata-misc \
	 tzdata-pacific \
	 tzdata-posix \
	 tzdata-right \
	 libsndfile1 \
	 icu \
	 attr \
	 acl \
	 bzip2 \
	 xz \
	 ncurses \
	 libvorbis \
	 nspr \
	 krb5 \
	 nss-altfiles \
	 llvm \
	 sqlite3 libsqlite3 \
	 expat \
	 cyrus-sasl \
	 elfutils \
         ca-certificates \
         libgcrypt \
         libxml2 \
         libxslt \
         libpng \
         iso-codes \
         lcms \
         json-c \
	 "
