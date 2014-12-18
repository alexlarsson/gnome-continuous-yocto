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
	 zip \
	 unzip \
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
         libtasn1 \
         libpng \
         iso-codes \
         lcms \
         json-c \
         popt \
         liblzma \
         libarchive \
         gmp \
         libssl \
         libatomics-ops \
         gdbm \
         glibc-gconv-ansi-x3.110 \
         glibc-gconv-armscii-8 \
         glibc-gconv-asmo-449 \
         glibc-gconv-big5 \
         glibc-gconv-big5hkscs \
         glibc-gconv-brf \
         glibc-gconv-cp10007 \
         glibc-gconv-cp1125 \
         glibc-gconv-cp1250 \
         glibc-gconv-cp1251 \
         glibc-gconv-cp1252 \
         glibc-gconv-cp1253 \
         glibc-gconv-cp1254 \
         glibc-gconv-cp1255 \
         glibc-gconv-cp1256 \
         glibc-gconv-cp1257 \
         glibc-gconv-cp1258 \
         glibc-gconv-cp737 \
         glibc-gconv-cp770 \
         glibc-gconv-cp771 \
         glibc-gconv-cp772 \
         glibc-gconv-cp773 \
         glibc-gconv-cp774 \
         glibc-gconv-cp775 \
         glibc-gconv-cp932 \
         glibc-gconv-csn-369103 \
         glibc-gconv-cwi \
         glibc-gconv-dec-mcs \
         glibc-gconv-ebcdic-at-de \
         glibc-gconv-ebcdic-at-de-a \
         glibc-gconv-ebcdic-ca-fr \
         glibc-gconv-ebcdic-dk-no \
         glibc-gconv-ebcdic-dk-no-a \
         glibc-gconv-ebcdic-es \
         glibc-gconv-ebcdic-es-a \
         glibc-gconv-ebcdic-es-s \
         glibc-gconv-ebcdic-fi-se \
         glibc-gconv-ebcdic-fi-se-a \
         glibc-gconv-ebcdic-fr \
         glibc-gconv-ebcdic-is-friss \
         glibc-gconv-ebcdic-it \
         glibc-gconv-ebcdic-pt \
         glibc-gconv-ebcdic-uk \
         glibc-gconv-ebcdic-us \
         glibc-gconv-ecma-cyrillic \
         glibc-gconv-euc-cn \
         glibc-gconv-euc-jisx0213 \
         glibc-gconv-euc-jp \
         glibc-gconv-euc-jp-ms \
         glibc-gconv-euc-kr \
         glibc-gconv-euc-tw \
         glibc-gconv-gb18030 \
         glibc-gconv-gbbig5 \
         glibc-gconv-gbgbk \
         glibc-gconv-gbk \
         glibc-gconv-georgian-academy \
         glibc-gconv-georgian-ps \
         glibc-gconv-gost-19768-74 \
         glibc-gconv-greek7 \
         glibc-gconv-greek7-old \
         glibc-gconv-greek-ccitt \
         glibc-gconv-hp-greek8 \
         glibc-gconv-hp-roman8 \
         glibc-gconv-hp-roman9 \
         glibc-gconv-hp-thai8 \
         glibc-gconv-hp-turkish8 \
         glibc-gconv-ibm037 \
         glibc-gconv-ibm038 \
         glibc-gconv-ibm1004 \
         glibc-gconv-ibm1008 \
         glibc-gconv-ibm1008-420 \
         glibc-gconv-ibm1025 \
         glibc-gconv-ibm1026 \
         glibc-gconv-ibm1046 \
         glibc-gconv-ibm1047 \
         glibc-gconv-ibm1097 \
         glibc-gconv-ibm1112 \
         glibc-gconv-ibm1122 \
         glibc-gconv-ibm1123 \
         glibc-gconv-ibm1124 \
         glibc-gconv-ibm1129 \
         glibc-gconv-ibm1130 \
         glibc-gconv-ibm1132 \
         glibc-gconv-ibm1133 \
         glibc-gconv-ibm1137 \
         glibc-gconv-ibm1140 \
         glibc-gconv-ibm1141 \
         glibc-gconv-ibm1142 \
         glibc-gconv-ibm1143 \
         glibc-gconv-ibm1144 \
         glibc-gconv-ibm1145 \
         glibc-gconv-ibm1146 \
         glibc-gconv-ibm1147 \
         glibc-gconv-ibm1148 \
         glibc-gconv-ibm1149 \
         glibc-gconv-ibm1153 \
         glibc-gconv-ibm1154 \
         glibc-gconv-ibm1155 \
         glibc-gconv-ibm1156 \
         glibc-gconv-ibm1157 \
         glibc-gconv-ibm1158 \
         glibc-gconv-ibm1160 \
         glibc-gconv-ibm1161 \
         glibc-gconv-ibm1162 \
         glibc-gconv-ibm1163 \
         glibc-gconv-ibm1164 \
         glibc-gconv-ibm1166 \
         glibc-gconv-ibm1167 \
         glibc-gconv-ibm12712 \
         glibc-gconv-ibm1364 \
         glibc-gconv-ibm1371 \
         glibc-gconv-ibm1388 \
         glibc-gconv-ibm1390 \
         glibc-gconv-ibm1399 \
         glibc-gconv-ibm16804 \
         glibc-gconv-ibm256 \
         glibc-gconv-ibm273 \
         glibc-gconv-ibm274 \
         glibc-gconv-ibm275 \
         glibc-gconv-ibm277 \
         glibc-gconv-ibm278 \
         glibc-gconv-ibm280 \
         glibc-gconv-ibm281 \
         glibc-gconv-ibm284 \
         glibc-gconv-ibm285 \
         glibc-gconv-ibm290 \
         glibc-gconv-ibm297 \
         glibc-gconv-ibm420 \
         glibc-gconv-ibm423 \
         glibc-gconv-ibm424 \
         glibc-gconv-ibm437 \
         glibc-gconv-ibm4517 \
         glibc-gconv-ibm4899 \
         glibc-gconv-ibm4909 \
         glibc-gconv-ibm4971 \
         glibc-gconv-ibm500 \
         glibc-gconv-ibm5347 \
         glibc-gconv-ibm803 \
         glibc-gconv-ibm850 \
         glibc-gconv-ibm851 \
         glibc-gconv-ibm852 \
         glibc-gconv-ibm855 \
         glibc-gconv-ibm856 \
         glibc-gconv-ibm857 \
         glibc-gconv-ibm860 \
         glibc-gconv-ibm861 \
         glibc-gconv-ibm862 \
         glibc-gconv-ibm863 \
         glibc-gconv-ibm864 \
         glibc-gconv-ibm865 \
         glibc-gconv-ibm866 \
         glibc-gconv-ibm866nav \
         glibc-gconv-ibm868 \
         glibc-gconv-ibm869 \
         glibc-gconv-ibm870 \
         glibc-gconv-ibm871 \
         glibc-gconv-ibm874 \
         glibc-gconv-ibm875 \
         glibc-gconv-ibm880 \
         glibc-gconv-ibm891 \
         glibc-gconv-ibm901 \
         glibc-gconv-ibm902 \
         glibc-gconv-ibm9030 \
         glibc-gconv-ibm903 \
         glibc-gconv-ibm904 \
         glibc-gconv-ibm905 \
         glibc-gconv-ibm9066 \
         glibc-gconv-ibm918 \
         glibc-gconv-ibm921 \
         glibc-gconv-ibm922 \
         glibc-gconv-ibm930 \
         glibc-gconv-ibm932 \
         glibc-gconv-ibm933 \
         glibc-gconv-ibm935 \
         glibc-gconv-ibm937 \
         glibc-gconv-ibm939 \
         glibc-gconv-ibm943 \
         glibc-gconv-ibm9448 \
         glibc-gconv-iec-p27-1 \
         glibc-gconv-inis \
         glibc-gconv-inis-8 \
         glibc-gconv-inis-cyrillic \
         glibc-gconv-isiri-3342 \
         glibc-gconv-iso-10367-box \
         glibc-gconv-iso-11548-1 \
         glibc-gconv-iso-2022-cn \
         glibc-gconv-iso-2022-cn-ext \
         glibc-gconv-iso-2022-jp \
         glibc-gconv-iso-2022-jp-3 \
         glibc-gconv-iso-2022-kr \
         glibc-gconv-iso-2033 \
         glibc-gconv-iso-5427 \
         glibc-gconv-iso-5427-ext \
         glibc-gconv-iso-5428 \
         glibc-gconv-iso646 \
         glibc-gconv-iso-6937 \
         glibc-gconv-iso-6937-2 \
         glibc-gconv-iso8859-10 \
         glibc-gconv-iso8859-11 \
         glibc-gconv-iso8859-1 \
         glibc-gconv-iso8859-13 \
         glibc-gconv-iso8859-14 \
         glibc-gconv-iso8859-15 \
         glibc-gconv-iso8859-16 \
         glibc-gconv-iso8859-2 \
         glibc-gconv-iso8859-3 \
         glibc-gconv-iso8859-4 \
         glibc-gconv-iso8859-5 \
         glibc-gconv-iso8859-6 \
         glibc-gconv-iso8859-7 \
         glibc-gconv-iso8859-8 \
         glibc-gconv-iso8859-9 \
         glibc-gconv-iso8859-9e \
         glibc-gconv-iso-ir-197 \
         glibc-gconv-iso-ir-209 \
         glibc-gconv-johab \
         glibc-gconv-koi-8 \
         glibc-gconv-koi8-r \
         glibc-gconv-koi8-ru \
         glibc-gconv-koi8-t \
         glibc-gconv-koi8-u \
         glibc-gconv-latin-greek-1 \
         glibc-gconv-latin-greek \
         glibc-gconv-libcns \
         glibc-gconv-libgb \
         glibc-gconv-libisoir165 \
         glibc-gconv-libjis \
         glibc-gconv-libjisx0213 \
         glibc-gconv-libksc \
         glibc-gconv-mac-centraleurope \
         glibc-gconv-macintosh \
         glibc-gconv-mac-is \
         glibc-gconv-mac-sami \
         glibc-gconv-mac-uk \
         glibc-gconv-mik \
         glibc-gconv-nats-dano \
         glibc-gconv-nats-sefi \
         glibc-gconv-pt154 \
         glibc-gconv-rk1048 \
         glibc-gconv-sami-ws2 \
         glibc-gconv-shift-jisx0213 \
         glibc-gconv-sjis \
         glibc-gconv-t.61 \
         glibc-gconv-tcvn5712-1 \
         glibc-gconv-tis-620 \
         glibc-gconv-tscii \
         glibc-gconv-uhc \
         glibc-gconv-unicode \
         glibc-gconv-utf-16 \
         glibc-gconv-utf-32 \
         glibc-gconv-utf-7 \
         glibc-gconv-viscii \
         glibc-charmap-ansi-x3.110-1983 \
         glibc-charmap-ansi-x3.4-1968 \
         glibc-charmap-armscii-8 \
         glibc-charmap-asmo-449 \
         glibc-charmap-big5 \
         glibc-charmap-big5-hkscs \
         glibc-charmap-brf \
         glibc-charmap-bs-4730 \
         glibc-charmap-bs-viewdata \
         glibc-charmap-cp10007 \
         glibc-charmap-cp1125 \
         glibc-charmap-cp1250 \
         glibc-charmap-cp1251 \
         glibc-charmap-cp1252 \
         glibc-charmap-cp1253 \
         glibc-charmap-cp1254 \
         glibc-charmap-cp1255 \
         glibc-charmap-cp1256 \
         glibc-charmap-cp1257 \
         glibc-charmap-cp1258 \
         glibc-charmap-cp737 \
         glibc-charmap-cp770 \
         glibc-charmap-cp771 \
         glibc-charmap-cp772 \
         glibc-charmap-cp773 \
         glibc-charmap-cp774 \
         glibc-charmap-cp775 \
         glibc-charmap-cp949 \
         glibc-charmap-csa-z243.4-1985-1 \
         glibc-charmap-csa-z243.4-1985-2 \
         glibc-charmap-csa-z243.4-1985-gr \
         glibc-charmap-csn-369103 \
         glibc-charmap-cwi \
         glibc-charmap-dec-mcs \
         glibc-charmap-din-66003 \
         glibc-charmap-ds-2089 \
         glibc-charmap-ebcdic-at-de \
         glibc-charmap-ebcdic-at-de-a \
         glibc-charmap-ebcdic-ca-fr \
         glibc-charmap-ebcdic-dk-no \
         glibc-charmap-ebcdic-dk-no-a \
         glibc-charmap-ebcdic-es \
         glibc-charmap-ebcdic-es-a \
         glibc-charmap-ebcdic-es-s \
         glibc-charmap-ebcdic-fi-se \
         glibc-charmap-ebcdic-fi-se-a \
         glibc-charmap-ebcdic-fr \
         glibc-charmap-ebcdic-is-friss \
         glibc-charmap-ebcdic-it \
         glibc-charmap-ebcdic-pt \
         glibc-charmap-ebcdic-uk \
         glibc-charmap-ebcdic-us \
         glibc-charmap-ecma-cyrillic \
         glibc-charmap-es \
         glibc-charmap-es2 \
         glibc-charmap-euc-jisx0213 \
         glibc-charmap-euc-jp \
         glibc-charmap-euc-jp-ms \
         glibc-charmap-euc-kr \
         glibc-charmap-euc-tw \
         glibc-charmap-gb18030 \
         glibc-charmap-gb-1988-80 \
         glibc-charmap-gb2312 \
         glibc-charmap-gbk \
         glibc-charmap-georgian-academy \
         glibc-charmap-georgian-ps \
         glibc-charmap-gost-19768-74 \
         glibc-charmap-greek7 \
         glibc-charmap-greek7-old \
         glibc-charmap-greek-ccitt \
         glibc-charmap-hp-greek8 \
         glibc-charmap-hp-roman8 \
         glibc-charmap-hp-roman9 \
         glibc-charmap-hp-thai8 \
         glibc-charmap-hp-turkish8 \
         glibc-charmap-ibm037 \
         glibc-charmap-ibm038 \
         glibc-charmap-ibm1004 \
         glibc-charmap-ibm1026 \
         glibc-charmap-ibm1047 \
         glibc-charmap-ibm1124 \
         glibc-charmap-ibm1129 \
         glibc-charmap-ibm1132 \
         glibc-charmap-ibm1133 \
         glibc-charmap-ibm1160 \
         glibc-charmap-ibm1161 \
         glibc-charmap-ibm1162 \
         glibc-charmap-ibm1163 \
         glibc-charmap-ibm1164 \
         glibc-charmap-ibm256 \
         glibc-charmap-ibm273 \
         glibc-charmap-ibm274 \
         glibc-charmap-ibm275 \
         glibc-charmap-ibm277 \
         glibc-charmap-ibm278 \
         glibc-charmap-ibm280 \
         glibc-charmap-ibm281 \
         glibc-charmap-ibm284 \
         glibc-charmap-ibm285 \
         glibc-charmap-ibm290 \
         glibc-charmap-ibm297 \
         glibc-charmap-ibm420 \
         glibc-charmap-ibm423 \
         glibc-charmap-ibm424 \
         glibc-charmap-ibm437 \
         glibc-charmap-ibm500 \
         glibc-charmap-ibm850 \
         glibc-charmap-ibm851 \
         glibc-charmap-ibm852 \
         glibc-charmap-ibm855 \
         glibc-charmap-ibm856 \
         glibc-charmap-ibm857 \
         glibc-charmap-ibm860 \
         glibc-charmap-ibm861 \
         glibc-charmap-ibm862 \
         glibc-charmap-ibm863 \
         glibc-charmap-ibm864 \
         glibc-charmap-ibm865 \
         glibc-charmap-ibm866 \
         glibc-charmap-ibm866nav \
         glibc-charmap-ibm868 \
         glibc-charmap-ibm869 \
         glibc-charmap-ibm870 \
         glibc-charmap-ibm871 \
         glibc-charmap-ibm874 \
         glibc-charmap-ibm875 \
         glibc-charmap-ibm880 \
         glibc-charmap-ibm891 \
         glibc-charmap-ibm903 \
         glibc-charmap-ibm904 \
         glibc-charmap-ibm905 \
         glibc-charmap-ibm918 \
         glibc-charmap-ibm922 \
         glibc-charmap-iec-p27-1 \
         glibc-charmap-inis \
         glibc-charmap-inis-8 \
         glibc-charmap-inis-cyrillic \
         glibc-charmap-invariant \
         glibc-charmap-isiri-3342 \
         glibc-charmap-iso-10367-box \
         glibc-charmap-iso-10646 \
         glibc-charmap-iso-11548-1 \
         glibc-charmap-iso-2033-1983 \
         glibc-charmap-iso-5427 \
         glibc-charmap-iso-5427-ext \
         glibc-charmap-iso-5428 \
         glibc-charmap-iso-646.basic \
         glibc-charmap-iso-646.irv \
         glibc-charmap-iso-6937 \
         glibc-charmap-iso-6937-2-25 \
         glibc-charmap-iso-6937-2-add \
         glibc-charmap-iso-8859-10 \
         glibc-charmap-iso-8859-11 \
         glibc-charmap-iso-8859-1 \
         glibc-charmap-iso-8859-13 \
         glibc-charmap-iso-8859-14 \
         glibc-charmap-iso-8859-15 \
         glibc-charmap-iso-8859-16 \
         glibc-charmap-iso-8859-1+gl \
         glibc-charmap-iso-8859-2 \
         glibc-charmap-iso-8859-3 \
         glibc-charmap-iso-8859-4 \
         glibc-charmap-iso-8859-5 \
         glibc-charmap-iso-8859-6 \
         glibc-charmap-iso-8859-7 \
         glibc-charmap-iso-8859-8 \
         glibc-charmap-iso-8859-9 \
         glibc-charmap-iso-8859-9e \
         glibc-charmap-iso-8859-supp \
         glibc-charmap-iso-ir-197 \
         glibc-charmap-iso-ir-209 \
         glibc-charmap-iso-ir-90 \
         glibc-charmap-it \
         glibc-charmap-jis-c6220-1969-jp \
         glibc-charmap-jis-c6220-1969-ro \
         glibc-charmap-jis-c6229-1984-a \
         glibc-charmap-jis-c6229-1984-b \
         glibc-charmap-jis-c6229-1984-b-add \
         glibc-charmap-jis-c6229-1984-hand \
         glibc-charmap-jis-c6229-1984-hand-add \
         glibc-charmap-jis-c6229-1984-kana \
         glibc-charmap-jis-x0201 \
         glibc-charmap-johab \
         glibc-charmap-jus-i.b1.002 \
         glibc-charmap-jus-i.b1.003-mac \
         glibc-charmap-jus-i.b1.003-serb \
         glibc-charmap-koi-8 \
         glibc-charmap-koi8-r \
         glibc-charmap-koi8-ru \
         glibc-charmap-koi8-t \
         glibc-charmap-koi8-u \
         glibc-charmap-ksc5636 \
         glibc-charmap-latin-greek-1 \
         glibc-charmap-latin-greek \
         glibc-charmap-mac-centraleurope \
         glibc-charmap-mac-cyrillic \
         glibc-charmap-macintosh \
         glibc-charmap-mac-is \
         glibc-charmap-mac-sami \
         glibc-charmap-mac-uk \
         glibc-charmap-mik \
         glibc-charmap-msz-7795.3 \
         glibc-charmap-nats-dano \
         glibc-charmap-nats-dano-add \
         glibc-charmap-nats-sefi \
         glibc-charmap-nats-sefi-add \
         glibc-charmap-nc-nc00-10 \
         glibc-charmap-nextstep \
         glibc-charmap-nf-z-62-010-1973 \
         glibc-charmap-nf-z-62-010 \
         glibc-charmap-ns-4551-1 \
         glibc-charmap-ns-4551-2 \
         glibc-charmap-pt154 \
         glibc-charmap-pt \
         glibc-charmap-pt2 \
         glibc-charmap-rk1048 \
         glibc-charmap-sami \
         glibc-charmap-sami-ws2 \
         glibc-charmap-sen-850200-b \
         glibc-charmap-sen-850200-c \
         glibc-charmap-shift-jis \
         glibc-charmap-shift-jisx0213 \
         glibc-charmap-t.101-g2 \
         glibc-charmap-t.61-7bit \
         glibc-charmap-t.61-8bit \
         glibc-charmap-tcvn5712-1 \
         glibc-charmap-tis-620 \
         glibc-charmap-tscii \
         glibc-charmap-utf-8 \
         glibc-charmap-videotex-suppl \
         glibc-charmap-viscii \
         glibc-charmap-windows-31j \
         glibc-binary-localedata-aa-dj \
         glibc-binary-localedata-af-za \
         glibc-binary-localedata-ak-gh \
         glibc-binary-localedata-an-es \
         glibc-binary-localedata-anp-in \
         glibc-binary-localedata-ar-ae \
         glibc-binary-localedata-ar-bh \
         glibc-binary-localedata-ar-dz \
         glibc-binary-localedata-ar-eg \
         glibc-binary-localedata-ar-in \
         glibc-binary-localedata-ar-iq \
         glibc-binary-localedata-ar-jo \
         glibc-binary-localedata-ar-kw \
         glibc-binary-localedata-ar-lb \
         glibc-binary-localedata-ar-ly \
         glibc-binary-localedata-ar-ma \
         glibc-binary-localedata-ar-om \
         glibc-binary-localedata-ar-qa \
         glibc-binary-localedata-ar-sa \
         glibc-binary-localedata-ar-sd \
         glibc-binary-localedata-ar-ss \
         glibc-binary-localedata-ar-sy \
         glibc-binary-localedata-ar-tn \
         glibc-binary-localedata-ar-ye \
         glibc-binary-localedata-as-in \
         glibc-binary-localedata-ast-es \
         glibc-binary-localedata-ayc-pe \
         glibc-binary-localedata-az-az \
         glibc-binary-localedata-be-by \
         glibc-binary-localedata-be-by+latin \
         glibc-binary-localedata-bem-zm \
         glibc-binary-localedata-ber-dz \
         glibc-binary-localedata-ber-ma \
         glibc-binary-localedata-bg-bg \
         glibc-binary-localedata-bho-in \
         glibc-binary-localedata-bn-in \
         glibc-binary-localedata-bo-cn \
         glibc-binary-localedata-bo-in \
         glibc-binary-localedata-br-fr \
         glibc-binary-localedata-brx-in \
         glibc-binary-localedata-bs-ba \
         glibc-binary-localedata-ca-ad \
         glibc-binary-localedata-ca-es \
         glibc-binary-localedata-ca-fr \
         glibc-binary-localedata-ca-it \
         glibc-binary-localedata-cmn-tw \
         glibc-binary-localedata-crh-ua \
         glibc-binary-localedata-csb-pl \
         glibc-binary-localedata-cs-cz \
         glibc-binary-localedata-cv-ru \
         glibc-binary-localedata-cy-gb \
         glibc-binary-localedata-da-dk \
         glibc-binary-localedata-de-at \
         glibc-binary-localedata-de-be \
         glibc-binary-localedata-de-ch \
         glibc-binary-localedata-de-de \
         glibc-binary-localedata-de-lu \
         glibc-binary-localedata-doi-in \
         glibc-binary-localedata-dv-mv \
         glibc-binary-localedata-dz-bt \
         glibc-binary-localedata-el-cy \
         glibc-binary-localedata-el-gr \
         glibc-binary-localedata-en-ag \
         glibc-binary-localedata-en-au \
         glibc-binary-localedata-en-bw \
         glibc-binary-localedata-en-ca \
         glibc-binary-localedata-en-dk \
         glibc-binary-localedata-en-gb \
         glibc-binary-localedata-en-hk \
         glibc-binary-localedata-en-ie \
         glibc-binary-localedata-en-in \
         glibc-binary-localedata-en-ng \
         glibc-binary-localedata-en-nz \
         glibc-binary-localedata-en-ph \
         glibc-binary-localedata-en-sg \
         glibc-binary-localedata-en-us \
         glibc-binary-localedata-en-za \
         glibc-binary-localedata-en-zm \
         glibc-binary-localedata-en-zw \
         glibc-binary-localedata-es-ar \
         glibc-binary-localedata-es-bo \
         glibc-binary-localedata-es-cl \
         glibc-binary-localedata-es-co \
         glibc-binary-localedata-es-cr \
         glibc-binary-localedata-es-cu \
         glibc-binary-localedata-es-do \
         glibc-binary-localedata-es-ec \
         glibc-binary-localedata-es-es \
         glibc-binary-localedata-es-gt \
         glibc-binary-localedata-es-hn \
         glibc-binary-localedata-es-mx \
         glibc-binary-localedata-es-ni \
         glibc-binary-localedata-es-pa \
         glibc-binary-localedata-es-pe \
         glibc-binary-localedata-es-pr \
         glibc-binary-localedata-es-py \
         glibc-binary-localedata-es-sv \
         glibc-binary-localedata-es-us \
         glibc-binary-localedata-es-uy \
         glibc-binary-localedata-es-ve \
         glibc-binary-localedata-et-ee \
         glibc-binary-localedata-eu-es \
         glibc-binary-localedata-fa-ir \
         glibc-binary-localedata-ff-sn \
         glibc-binary-localedata-fi-fi \
         glibc-binary-localedata-fil-ph \
         glibc-binary-localedata-fo-fo \
         glibc-binary-localedata-fr-be \
         glibc-binary-localedata-fr-ca \
         glibc-binary-localedata-fr-ch \
         glibc-binary-localedata-fr-fr \
         glibc-binary-localedata-fr-lu \
         glibc-binary-localedata-fur-it \
         glibc-binary-localedata-fy-de \
         glibc-binary-localedata-fy-nl \
         glibc-binary-localedata-ga-ie \
         glibc-binary-localedata-gd-gb \
         glibc-binary-localedata-gl-es \
         glibc-binary-localedata-gu-in \
         glibc-binary-localedata-gv-gb \
         glibc-binary-localedata-hak-tw \
         glibc-binary-localedata-ha-ng \
         glibc-binary-localedata-he-il \
         glibc-binary-localedata-hi-in \
         glibc-binary-localedata-hne-in \
         glibc-binary-localedata-hr-hr \
         glibc-binary-localedata-hsb-de \
         glibc-binary-localedata-ht-ht \
         glibc-binary-localedata-hu-hu \
         glibc-binary-localedata-hy-am \
         glibc-binary-localedata-ia-fr \
         glibc-binary-localedata-id-id \
         glibc-binary-localedata-ig-ng \
         glibc-binary-localedata-ik-ca \
         glibc-binary-localedata-is-is \
         glibc-binary-localedata-it-ch \
         glibc-binary-localedata-it-it \
         glibc-binary-localedata-iu-ca \
         glibc-binary-localedata-iw-il \
         glibc-binary-localedata-ja-jp \
         glibc-binary-localedata-ka-ge \
         glibc-binary-localedata-kk-kz \
         glibc-binary-localedata-kl-gl \
         glibc-binary-localedata-km-kh \
         glibc-binary-localedata-kn-in \
         glibc-binary-localedata-kok-in \
         glibc-binary-localedata-ko-kr \
         glibc-binary-localedata-ks-in \
         glibc-binary-localedata-ks-in+devanagari \
         glibc-binary-localedata-ku-tr \
         glibc-binary-localedata-kw-gb \
         glibc-binary-localedata-ky-kg \
         glibc-binary-localedata-lb-lu \
         glibc-binary-localedata-lg-ug \
         glibc-binary-localedata-li-be \
         glibc-binary-localedata-lij-it \
         glibc-binary-localedata-li-nl \
         glibc-binary-localedata-lo-la \
         glibc-binary-localedata-lt-lt \
         glibc-binary-localedata-lv-lv \
         glibc-binary-localedata-lzh-tw \
         glibc-binary-localedata-mag-in \
         glibc-binary-localedata-mai-in \
         glibc-binary-localedata-mg-mg \
         glibc-binary-localedata-mhr-ru \
         glibc-binary-localedata-mi-nz \
         glibc-binary-localedata-mk-mk \
         glibc-binary-localedata-ml-in \
         glibc-binary-localedata-mni-in \
         glibc-binary-localedata-mr-in \
         glibc-binary-localedata-ms-my \
         glibc-binary-localedata-mt-mt \
         glibc-binary-localedata-my-mm \
         glibc-binary-localedata-nan-tw \
         glibc-binary-localedata-nan-tw+latin \
         glibc-binary-localedata-nb-no \
         glibc-binary-localedata-nds-de \
         glibc-binary-localedata-nds-nl \
         glibc-binary-localedata-ne-np \
         glibc-binary-localedata-nhn-mx \
         glibc-binary-localedata-niu-nu \
         glibc-binary-localedata-niu-nz \
         glibc-binary-localedata-nl-aw \
         glibc-binary-localedata-nl-be \
         glibc-binary-localedata-nl-nl \
         glibc-binary-localedata-nn-no \
         glibc-binary-localedata-nr-za \
         glibc-binary-localedata-nso-za \
         glibc-binary-localedata-oc-fr \
         glibc-binary-localedata-om-ke \
         glibc-binary-localedata-or-in \
         glibc-binary-localedata-os-ru \
         glibc-binary-localedata-pa-in \
         glibc-binary-localedata-pap-an \
         glibc-binary-localedata-pap-aw \
         glibc-binary-localedata-pap-cw \
         glibc-binary-localedata-pa-pk \
         glibc-binary-localedata-pl-pl \
         glibc-binary-localedata-ps-af \
         glibc-binary-localedata-pt-br \
         glibc-binary-localedata-pt-pt \
         glibc-binary-localedata-quz-pe \
         glibc-binary-localedata-ro-ro \
         glibc-binary-localedata-ru-ru \
         glibc-binary-localedata-ru-ua \
         glibc-binary-localedata-rw-rw \
         glibc-binary-localedata-sa-in \
         glibc-binary-localedata-sat-in \
         glibc-binary-localedata-sc-it \
         glibc-binary-localedata-sd-in \
         glibc-binary-localedata-sd-in+devanagari \
         glibc-binary-localedata-se-no \
         glibc-binary-localedata-shs-ca \
         glibc-binary-localedata-si-lk \
         glibc-binary-localedata-sk-sk \
         glibc-binary-localedata-sl-si \
         glibc-binary-localedata-so-dj \
         glibc-binary-localedata-so-ke \
         glibc-binary-localedata-so-so \
         glibc-binary-localedata-sq-al \
         glibc-binary-localedata-sq-mk \
         glibc-binary-localedata-sr-me \
         glibc-binary-localedata-sr-rs \
         glibc-binary-localedata-sr-rs+latin \
         glibc-binary-localedata-ss-za \
         glibc-binary-localedata-st-za \
         glibc-binary-localedata-sv-fi \
         glibc-binary-localedata-sv-se \
         glibc-binary-localedata-sw-ke \
         glibc-binary-localedata-sw-tz \
         glibc-binary-localedata-szl-pl \
         glibc-binary-localedata-ta-in \
         glibc-binary-localedata-ta-lk \
         glibc-binary-localedata-tg-tj \
         glibc-binary-localedata-the-np \
         glibc-binary-localedata-th-th \
         glibc-binary-localedata-tk-tm \
         glibc-binary-localedata-tl-ph \
         glibc-binary-localedata-tn-za \
         glibc-binary-localedata-tr-cy \
         glibc-binary-localedata-ts-za \
         glibc-binary-localedata-tt-ru \
         glibc-binary-localedata-tt-ru+iqtelif \
         glibc-binary-localedata-ug-cn \
         glibc-binary-localedata-uk-ua \
         glibc-binary-localedata-unm-us \
         glibc-binary-localedata-ur-in \
         glibc-binary-localedata-ur-pk \
         glibc-binary-localedata-uz-uz \
         glibc-binary-localedata-uz-uz+cyrillic \
         glibc-binary-localedata-ve-za \
         glibc-binary-localedata-vi-vn \
         glibc-binary-localedata-wa-be \
         glibc-binary-localedata-wae-ch \
         glibc-binary-localedata-wo-sn \
         glibc-binary-localedata-xh-za \
         glibc-binary-localedata-yi-us \
         glibc-binary-localedata-yo-ng \
         glibc-binary-localedata-yue-hk \
         glibc-binary-localedata-zh-cn \
         glibc-binary-localedata-zh-hk \
         glibc-binary-localedata-zh-sg \
         glibc-binary-localedata-zh-tw \
         glibc-binary-localedata-zu-za \
         iso-codes-locale-aa \
         iso-codes-locale-af \
         iso-codes-locale-am \
         iso-codes-locale-ar \
         iso-codes-locale-az \
         iso-codes-locale-be \
         iso-codes-locale-bg \
         iso-codes-locale-bn \
         iso-codes-locale-br \
         iso-codes-locale-bs \
         iso-codes-locale-byn \
         iso-codes-locale-ca \
         iso-codes-locale-cs \
         iso-codes-locale-cy \
         iso-codes-locale-da \
         iso-codes-locale-de \
         iso-codes-locale-dv \
         iso-codes-locale-dz \
         iso-codes-locale-el \
         iso-codes-locale-eo \
         iso-codes-locale-es \
         iso-codes-locale-et \
         iso-codes-locale-eu \
         iso-codes-locale-fa \
         iso-codes-locale-fi \
         iso-codes-locale-fo \
         iso-codes-locale-fr \
         iso-codes-locale-ga \
         iso-codes-locale-gez \
         iso-codes-locale-gl \
         iso-codes-locale-gu \
         iso-codes-locale-gv \
         iso-codes-locale-haw \
         iso-codes-locale-he \
         iso-codes-locale-hi \
         iso-codes-locale-hr \
         iso-codes-locale-hu \
         iso-codes-locale-hy \
         iso-codes-locale-id \
         iso-codes-locale-is \
         iso-codes-locale-it \
         iso-codes-locale-iu \
         iso-codes-locale-ja \
         iso-codes-locale-ka \
         iso-codes-locale-kk \
         iso-codes-locale-kl \
         iso-codes-locale-km \
         iso-codes-locale-kn \
         iso-codes-locale-ko \
         iso-codes-locale-kok \
         iso-codes-locale-ku \
         iso-codes-locale-kw \
         iso-codes-locale-ky \
         iso-codes-locale-lt \
         iso-codes-locale-lv \
         iso-codes-locale-mi \
         iso-codes-locale-mk \
         iso-codes-locale-ml \
         iso-codes-locale-mn \
         iso-codes-locale-mr \
         iso-codes-locale-ms \
         iso-codes-locale-mt \
         iso-codes-locale-nb \
         iso-codes-locale-ne \
         iso-codes-locale-nl \
         iso-codes-locale-nn \
         iso-codes-locale-no \
         iso-codes-locale-nso \
         iso-codes-locale-oc \
         iso-codes-locale-om \
         iso-codes-locale-pa \
         iso-codes-locale-pl \
         iso-codes-locale-ps \
         iso-codes-locale-pt \
         iso-codes-locale-pt-br \
         iso-codes-locale-ro \
         iso-codes-locale-ru \
         iso-codes-locale-rw \
         iso-codes-locale-sa \
         iso-codes-locale-sid \
         iso-codes-locale-sk \
         iso-codes-locale-sl \
         iso-codes-locale-so \
         iso-codes-locale-sq \
         iso-codes-locale-sr \
         iso-codes-locale-sv \
         iso-codes-locale-sw \
         iso-codes-locale-syr \
         iso-codes-locale-ta \
         iso-codes-locale-te \
         iso-codes-locale-th \
         iso-codes-locale-ti \
         iso-codes-locale-tig \
         iso-codes-locale-tk \
         iso-codes-locale-tl \
         iso-codes-locale-tr \
         iso-codes-locale-tt \
         iso-codes-locale-uk \
         iso-codes-locale-ur \
         iso-codes-locale-uz \
         iso-codes-locale-ve \
         iso-codes-locale-vi \
         iso-codes-locale-wa \
         iso-codes-locale-wal \
         iso-codes-locale-wo \
         iso-codes-locale-xh \
         iso-codes-locale-zh-cn \
         iso-codes-locale-zh-hk \
         iso-codes-locale-zh-tw \
         iso-codes-locale-zu \
	 "
