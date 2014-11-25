#
# Copyright (C) 2011 Colin Walters <walters@verbum.org>
#
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

PACKAGE_ARCH = "${MACHINE_ARCH}"
ALLOW_EMPTY_${PN} = "1"

PR = "3"

# We explicitly want -dbg packages
INSANE_SKIP_${PN} = "debug-deps dev-deps"

RDEPENDS_${PN} += "     \
	 autoconf \
	 automake \
	 bc \
	 binutils \
	 binutils-symlinks \
	 coreutils \
	 cpp \
	 cpp-symlinks \
	 ccache \
	 diffutils \
	 gcc \
	 gcc-symlinks \
	 g++ \
	 g++-symlinks \
	 gettext \
	 make \
	 intltool \
	 libtool \
	 libtool-dev \
         perl-dev \
         perl-module-env \
         perl-module-getopt-std \
         perl-module-getopt-long \
         perl-module-base \
	 perl-module-re \
	 perl-module-safe \
	 perl-module-text-wrap \
	 perl-module-file-find \
	 perl-module-encode \
	 perl-module-pod-text \
         perl-module-version \
         perl-module-unicore \
         perl-module-utf8 \
         perl-module-unicode-normalize \
         perl-module-unicode-collate \
         libxml-parser-perl-dev \
	 perl-modules \
	 pkgconfig \
	 findutils \
	 less \
	 ldd \
	 file \
	 elfutils \
	 valgrind \
	 python-dev \
	 python-modules \
	 python-misc \
	 python3-dev \
	 python3-modules \
	 python3-misc \
	 libffi-dev \
	 bison flex \
	 git \
	 git-perltools \
	 gdb \
	 zip \
	 ruby \
	 cmake \
	 llvm-dev \
	 libxml-parser-perl \
	 gettext-dev \
	 bzip2-dev \
	 libbz2-dev \
	 xz-dev \
	 zlib-dev \
	 gdbm-dev \
	 libtool-dev \
	 util-linux-libuuid-dev \
	 libpam-dev \
	 tiff-dev \
	 libjpeg-turbo-dev \
	 libjpeg-turbo-dbg \
	 libexif-dev \
	 libtool-dev \
	 libsndfile1-dev \
	 alsa-dev \
	 libogg-dev \
	 libvorbis-dev \
	 libssp-dev \
	 libstdc++-dev \
	 libcap-dev \
	 libcap-bin \
	 libgpg-error-dev \
	 libtasn1-dev \
	 libtasn1-bin \
	 libgcrypt-dev \
	 libattr-dev \
	 libacl-dev \
	 nettle-dev \
	 gnutls-dev \
	 icu-dev \
	 curl-dev \
	 nspr-dev \
	 ncurses-dev \
	 db-dev \
	 cracklib-dev \
	 e2fsprogs-dev \
	 krb5-dev \
         llvm-dev \
	 libsqlite3-dev \
	 expat-dev \
	 intltool \
	 texinfo \
	 python-pyparsing \
	 cyrus-sasl-dev \
	 elfutils-dev \
	 libelf-dev \
	 libasm-dev \
	 libdw-dev \
         gperf \
         libpng-dev \
         libxml2-dev \
         libxml2-python \
         libxslt-dev \
         libxslt-bin \
         lcms-dev \
	 strace \
         chrpath \
         rpm \
         python-smartpm \
         smartpm \
         patch \
         readline-dev \
	 "
