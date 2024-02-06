
Welcome to Ubuntu 22.04.2 LTS (GNU/Linux 5.15.0-76-generic x86_64)

 * Documentation:  https://help.ubuntu.com
 * Management:     https://landscape.canonical.com
 * Support:        https://ubuntu.com/advantage

  System information as of Tue Feb  6 07:29:30 PM MSK 2024

  System load:  0.080078125       Processes:             96
  Usage of /:   10.0% of 9.76GB   Users logged in:       0
  Memory usage: 19%               IPv4 address for ens3: 192.168.0.83
  Swap usage:   0%


Expanded Security Maintenance for Applications is not enabled.

5 updates can be applied immediately.
To see these additional updates run: apt list --upgradable

Enable ESM Apps to receive additional future security updates.
See https://ubuntu.com/esm or run: sudo pro status


The list of available updates is more than a week old.
To check for new updates run: sudo apt update

Last login: Tue Feb  6 19:27:32 2024 from 79.139.139.134
root@cv3561837:~# echo camel donkey horse > pack_animals
root@cv3561837:~# cat pets pack_animals > animals
root@cv3561837:~# cat animals
cat dog hamster
camel donkey horse
root@cv3561837:~# mv animals > humans_friends
mv: missing destination file operand after 'animals'
Try 'mv --help' for more information.
root@cv3561837:~# mv animals humans_friends
root@cv3561837:~# ls -ali
total 52
128006 drwx------  5 root root 4096 Feb  6 19:32 .
     2 drwxr-xr-x 18 root root 4096 Feb  6 19:24 ..
128640 -rw-------  1 root root   58 Feb  6 19:29 .bash_history
128215 -rw-r--r--  1 root root 3106 Oct 15  2021 .bashrc
148954 -rw-r--r--  1 root root   98 Jul 13  2023 .build.env
129133 drwx------  2 root root 4096 Jul 13  2023 .cache
128860 -rw-r--r--  1 root root   35 Feb  6 19:30 humans_friends
128614 -rw-r--r--  1 root root   19 Feb  6 19:29 pack_animals
128183 -rw-r--r--  1 root root   16 Feb  6 19:28 pets
128216 -rw-r--r--  1 root root  161 Jul  9  2019 .profile
129002 drwx------  3 root root 4096 Jul 13  2023 snap
128002 drwx------  2 root root 4096 Feb  6 19:24 .ssh
129132 -rw-------  1 root root   65 Feb  6 19:29 .Xauthority
root@cv3561837:~#



root@cv3561837:~# mkdir main_directory
root@cv3561837:~# ~/main_directory
-bash: /root/main_directory: Is a directory
root@cv3561837:~# cd ~/main_directory
root@cv3561837:~/main_directory# mv humans_friends ~/main_directory
mv: cannot stat 'humans_friends': No such file or directory
root@cv3561837:~/main_directory# cd
root@cv3561837:~# mv humans_friends ~/main_directory
root@cv3561837:~# cd ~/main_directory
root@cv3561837:~/main_directory# ls -ali
total 12
128971 drwxr-xr-x 2 root root 4096 Feb  6 19:34 .
128006 drwx------ 6 root root 4096 Feb  6 19:34 ..
128860 -rw-r--r-- 1 root root   35 Feb  6 19:30 humans_friends


root@cv3561837:~/main_directory# sudo wget https://dev.mysql.com/get/mysql-apt-config_0.8.23-1_all.deb
--2024-02-06 19:37:15--  https://dev.mysql.com/get/mysql-apt-config_0.8.23-1_all.deb
Resolving dev.mysql.com (dev.mysql.com)... 184.51.238.43, 2a02:2d8:3:9a9::2e31, 2a02:2d8:3:9a5::2e31
Connecting to dev.mysql.com (dev.mysql.com)|184.51.238.43|:443... connected.
HTTP request sent, awaiting response... 302 Moved Temporarily
Location: https://repo.mysql.com//mysql-apt-config_0.8.23-1_all.deb [following]
--2024-02-06 19:37:16--  https://repo.mysql.com//mysql-apt-config_0.8.23-1_all.deb
Resolving repo.mysql.com (repo.mysql.com)... 23.210.253.161, 2a02:26f0:d200:889::1d68, 2a02:26f0:d200:888::1d68
Connecting to repo.mysql.com (repo.mysql.com)|23.210.253.161|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: 18028 (18K) [application/x-debian-package]
Saving to: ‘mysql-apt-config_0.8.23-1_all.deb’

mysql-apt-config_0.8. 100%[=======================>]  17.61K  --.-KB/s    in 0s

2024-02-06 19:37:16 (145 MB/s) - ‘mysql-apt-config_0.8.23-1_all.deb’ saved [18028/18028]

root@cv3561837:~/main_directory# sudo dpkg -i mysql-apt-config_0.8.23-1_all.deb
Selecting previously unselected package mysql-apt-config.
(Reading database ... 64865 files and directories currently installed.)
Preparing to unpack mysql-apt-config_0.8.23-1_all.deb ...
Unpacking mysql-apt-config (0.8.23-1) ...
Setting up mysql-apt-config (0.8.23-1) ...
Warning: apt-key should not be used in scripts (called from postinst maintainerscript of the package mysql-apt-config)
Warning: apt-key is deprecated. Manage keyring files in trusted.gpg.d instead (see apt-key(8)).
OK
root@cv3561837:~/main_directory# sudo apt-get update
Hit:1 http://ru.archive.ubuntu.com/ubuntu jammy InRelease
Get:2 http://ru.archive.ubuntu.com/ubuntu jammy-updates InRelease [119 kB]
Get:3 http://repo.mysql.com/apt/ubuntu jammy InRelease [20.2 kB]
Get:4 http://ru.archive.ubuntu.com/ubuntu jammy-backports InRelease [109 kB]
Err:3 http://repo.mysql.com/apt/ubuntu jammy InRelease
  The following signatures couldn't be verified because the public key is not available: NO_PUBKEY B7B3B788A8D3785C
Get:5 http://ru.archive.ubuntu.com/ubuntu jammy-updates/main amd64 Packages [1,680 kB]
Get:6 http://ru.archive.ubuntu.com/ubuntu jammy-updates/main Translation-en [387 kB]
Get:7 http://ru.archive.ubuntu.com/ubuntu jammy-updates/main amd64 c-n-f Metadata [16.1 kB]
Get:8 http://ru.archive.ubuntu.com/ubuntu jammy-updates/restricted amd64 Packages [1,728 kB]
Get:9 http://ru.archive.ubuntu.com/ubuntu jammy-updates/restricted Translation-en [281 kB]
Get:10 http://ru.archive.ubuntu.com/ubuntu jammy-updates/restricted amd64 c-n-f Metadata [520 B]
Get:11 http://ru.archive.ubuntu.com/ubuntu jammy-updates/universe amd64 Packages [1,334 kB]
Get:12 http://ru.archive.ubuntu.com/ubuntu jammy-updates/universe Translation-en [324 kB]
Get:13 http://ru.archive.ubuntu.com/ubuntu jammy-updates/universe amd64 c-n-f Metadata [22.1 kB]
Get:14 http://ru.archive.ubuntu.com/ubuntu jammy-updates/multiverse amd64 Packages [50.4 kB]
Get:15 http://ru.archive.ubuntu.com/ubuntu jammy-updates/multiverse Translation-en [12.0 kB]
Get:16 http://ru.archive.ubuntu.com/ubuntu jammy-updates/multiverse amd64 c-n-f Metadata [472 B]
Get:17 http://ru.archive.ubuntu.com/ubuntu jammy-backports/main amd64 Packages [50.4 kB]
Get:18 http://ru.archive.ubuntu.com/ubuntu jammy-backports/main Translation-en [12.2 kB]
Get:19 http://ru.archive.ubuntu.com/ubuntu jammy-backports/main amd64 c-n-f Metadata [388 B]
Get:20 http://ru.archive.ubuntu.com/ubuntu jammy-backports/universe amd64 Packages [28.1 kB]
Get:21 http://ru.archive.ubuntu.com/ubuntu jammy-backports/universe Translation-en [18.0 kB]
Get:22 http://ru.archive.ubuntu.com/ubuntu jammy-backports/universe amd64 c-n-f Metadata [644 B]
Reading package lists... Done
W: GPG error: http://repo.mysql.com/apt/ubuntu jammy InRelease: The following signatures couldn't be verified because the public key is not available: NO_PUBKEY B7B3B788A8D3785C
E: The repository 'http://repo.mysql.com/apt/ubuntu jammy InRelease' is not signed.
N: Updating from such a repository can't be done securely, and is therefore disabled by default.
N: See apt-secure(8) manpage for repository creation and user configuration details.
root@cv3561837:~/main_directory# sudo apt-get install mysql-server
Reading package lists... Done
Building dependency tree... Done
Reading state information... Done
The following additional packages will be installed:
  libcgi-fast-perl libcgi-pm-perl libclone-perl libencode-locale-perl
  libevent-pthreads-2.1-7 libfcgi-bin libfcgi-perl libfcgi0ldbl libhtml-parser-perl
  libhtml-tagset-perl libhtml-template-perl libhttp-date-perl libhttp-message-perl
  libio-html-perl liblwp-mediatypes-perl libmecab2 libprotobuf-lite23
  libtimedate-perl liburi-perl mecab-ipadic mecab-ipadic-utf8 mecab-utils
  mysql-client-8.0 mysql-client-core-8.0 mysql-common mysql-server-8.0
  mysql-server-core-8.0
Suggested packages:
  libdata-dump-perl libipc-sharedcache-perl libbusiness-isbn-perl libwww-perl mailx
  tinyca
The following NEW packages will be installed:
  libcgi-fast-perl libcgi-pm-perl libclone-perl libencode-locale-perl
  libevent-pthreads-2.1-7 libfcgi-bin libfcgi-perl libfcgi0ldbl libhtml-parser-perl
  libhtml-tagset-perl libhtml-template-perl libhttp-date-perl libhttp-message-perl
  libio-html-perl liblwp-mediatypes-perl libmecab2 libprotobuf-lite23
  libtimedate-perl liburi-perl mecab-ipadic mecab-ipadic-utf8 mecab-utils
  mysql-client-8.0 mysql-client-core-8.0 mysql-common mysql-server mysql-server-8.0
  mysql-server-core-8.0
0 upgraded, 28 newly installed, 0 to remove and 126 not upgraded.
Need to get 29.5 MB of archives.
After this operation, 243 MB of additional disk space will be used.
Do you want to continue? [Y/n] y
Get:1 http://ru.archive.ubuntu.com/ubuntu jammy/main amd64 mysql-common all 5.8+1.0.8 [7,212 B]
Get:2 http://ru.archive.ubuntu.com/ubuntu jammy-updates/main amd64 mysql-client-core-8.0 amd64 8.0.36-0ubuntu0.22.04.1 [2,692 kB]
Get:3 http://ru.archive.ubuntu.com/ubuntu jammy-updates/main amd64 mysql-client-8.0 amd64 8.0.36-0ubuntu0.22.04.1 [22.7 kB]
Get:4 http://ru.archive.ubuntu.com/ubuntu jammy/main amd64 libevent-pthreads-2.1-7 amd64 2.1.12-stable-1build3 [7,642 B]
Get:5 http://ru.archive.ubuntu.com/ubuntu jammy/main amd64 libmecab2 amd64 0.996-14build9 [199 kB]
Get:6 http://ru.archive.ubuntu.com/ubuntu jammy-updates/main amd64 libprotobuf-lite23 amd64 3.12.4-1ubuntu7.22.04.1 [209 kB]
Get:7 http://ru.archive.ubuntu.com/ubuntu jammy-updates/main amd64 mysql-server-core-8.0 amd64 8.0.36-0ubuntu0.22.04.1 [17.5 MB]
Get:8 http://ru.archive.ubuntu.com/ubuntu jammy-updates/main amd64 mysql-server-8.0 amd64 8.0.36-0ubuntu0.22.04.1 [1,437 kB]
Get:9 http://ru.archive.ubuntu.com/ubuntu jammy/main amd64 libhtml-tagset-perl all 3.20-4 [12.5 kB]
Get:10 http://ru.archive.ubuntu.com/ubuntu jammy/main amd64 liburi-perl all 5.10-1 [78.8 kB]
Get:11 http://ru.archive.ubuntu.com/ubuntu jammy/main amd64 libhtml-parser-perl amd64 3.76-1build2 [88.4 kB]
Get:12 http://ru.archive.ubuntu.com/ubuntu jammy/main amd64 libcgi-pm-perl all 4.54-1 [188 kB]
Get:13 http://ru.archive.ubuntu.com/ubuntu jammy/main amd64 libfcgi0ldbl amd64 2.4.2-2build2 [28.0 kB]
Get:14 http://ru.archive.ubuntu.com/ubuntu jammy/main amd64 libfcgi-perl amd64 0.82+ds-1build1 [22.8 kB]
Get:15 http://ru.archive.ubuntu.com/ubuntu jammy/main amd64 libcgi-fast-perl all 1:2.15-1 [10.5 kB]
Get:16 http://ru.archive.ubuntu.com/ubuntu jammy/main amd64 libclone-perl amd64 0.45-1build3 [11.0 kB]
Get:17 http://ru.archive.ubuntu.com/ubuntu jammy/main amd64 libencode-locale-perl all 1.05-1.1 [11.8 kB]
Get:18 http://ru.archive.ubuntu.com/ubuntu jammy/main amd64 libfcgi-bin amd64 2.4.2-2build2 [11.2 kB]
Get:19 http://ru.archive.ubuntu.com/ubuntu jammy/main amd64 libhtml-template-perl all 2.97-1.1 [59.1 kB]
Get:20 http://ru.archive.ubuntu.com/ubuntu jammy/main amd64 libtimedate-perl all 2.3300-2 [34.0 kB]
Get:21 http://ru.archive.ubuntu.com/ubuntu jammy/main amd64 libhttp-date-perl all 6.05-1 [9,920 B]
Get:22 http://ru.archive.ubuntu.com/ubuntu jammy/main amd64 libio-html-perl all 1.004-2 [15.4 kB]
Get:23 http://ru.archive.ubuntu.com/ubuntu jammy/main amd64 liblwp-mediatypes-perl all 6.04-1 [19.5 kB]
Get:24 http://ru.archive.ubuntu.com/ubuntu jammy/main amd64 libhttp-message-perl all 6.36-1 [76.8 kB]
Get:25 http://ru.archive.ubuntu.com/ubuntu jammy/main amd64 mecab-utils amd64 0.996-14build9 [4,850 B]
Get:26 http://ru.archive.ubuntu.com/ubuntu jammy/main amd64 mecab-ipadic all 2.7.0-20070801+main-3 [6,718 kB]
Get:27 http://ru.archive.ubuntu.com/ubuntu jammy/main amd64 mecab-ipadic-utf8 all 2.7.0-20070801+main-3 [4,384 B]
Get:28 http://ru.archive.ubuntu.com/ubuntu jammy-updates/main amd64 mysql-server all 8.0.36-0ubuntu0.22.04.1 [9,460 B]
Fetched 29.5 MB in 0s (60.6 MB/s)
Preconfiguring packages ...
Selecting previously unselected package mysql-common.
(Reading database ... 64870 files and directories currently installed.)
Preparing to unpack .../0-mysql-common_5.8+1.0.8_all.deb ...
Unpacking mysql-common (5.8+1.0.8) ...
Selecting previously unselected package mysql-client-core-8.0.
Preparing to unpack .../1-mysql-client-core-8.0_8.0.36-0ubuntu0.22.04.1_amd64.deb ...
Unpacking mysql-client-core-8.0 (8.0.36-0ubuntu0.22.04.1) ...
Selecting previously unselected package mysql-client-8.0.
Preparing to unpack .../2-mysql-client-8.0_8.0.36-0ubuntu0.22.04.1_amd64.deb ...
Unpacking mysql-client-8.0 (8.0.36-0ubuntu0.22.04.1) ...
Selecting previously unselected package libevent-pthreads-2.1-7:amd64.
Preparing to unpack .../3-libevent-pthreads-2.1-7_2.1.12-stable-1build3_amd64.deb ...
Unpacking libevent-pthreads-2.1-7:amd64 (2.1.12-stable-1build3) ...
Selecting previously unselected package libmecab2:amd64.
Preparing to unpack .../4-libmecab2_0.996-14build9_amd64.deb ...
Unpacking libmecab2:amd64 (0.996-14build9) ...
Selecting previously unselected package libprotobuf-lite23:amd64.
Preparing to unpack .../5-libprotobuf-lite23_3.12.4-1ubuntu7.22.04.1_amd64.deb ...
Unpacking libprotobuf-lite23:amd64 (3.12.4-1ubuntu7.22.04.1) ...
Selecting previously unselected package mysql-server-core-8.0.
Preparing to unpack .../6-mysql-server-core-8.0_8.0.36-0ubuntu0.22.04.1_amd64.deb ...
Unpacking mysql-server-core-8.0 (8.0.36-0ubuntu0.22.04.1) ...
Setting up mysql-common (5.8+1.0.8) ...
update-alternatives: using /etc/mysql/my.cnf.fallback to provide /etc/mysql/my.cnf (my.cnf) in auto mode
Selecting previously unselected package mysql-server-8.0.
(Reading database ... 65084 files and directories currently installed.)
Preparing to unpack .../00-mysql-server-8.0_8.0.36-0ubuntu0.22.04.1_amd64.deb ...
Unpacking mysql-server-8.0 (8.0.36-0ubuntu0.22.04.1) ...
Selecting previously unselected package libhtml-tagset-perl.
Preparing to unpack .../01-libhtml-tagset-perl_3.20-4_all.deb ...
Unpacking libhtml-tagset-perl (3.20-4) ...
Selecting previously unselected package liburi-perl.
Preparing to unpack .../02-liburi-perl_5.10-1_all.deb ...
Unpacking liburi-perl (5.10-1) ...
Selecting previously unselected package libhtml-parser-perl:amd64.
Preparing to unpack .../03-libhtml-parser-perl_3.76-1build2_amd64.deb ...
Unpacking libhtml-parser-perl:amd64 (3.76-1build2) ...
Selecting previously unselected package libcgi-pm-perl.
Preparing to unpack .../04-libcgi-pm-perl_4.54-1_all.deb ...
Unpacking libcgi-pm-perl (4.54-1) ...
Selecting previously unselected package libfcgi0ldbl:amd64.
Preparing to unpack .../05-libfcgi0ldbl_2.4.2-2build2_amd64.deb ...
Unpacking libfcgi0ldbl:amd64 (2.4.2-2build2) ...
Selecting previously unselected package libfcgi-perl:amd64.
Preparing to unpack .../06-libfcgi-perl_0.82+ds-1build1_amd64.deb ...
Unpacking libfcgi-perl:amd64 (0.82+ds-1build1) ...
Selecting previously unselected package libcgi-fast-perl.
Preparing to unpack .../07-libcgi-fast-perl_1%3a2.15-1_all.deb ...
Unpacking libcgi-fast-perl (1:2.15-1) ...
Selecting previously unselected package libclone-perl.
Preparing to unpack .../08-libclone-perl_0.45-1build3_amd64.deb ...
Unpacking libclone-perl (0.45-1build3) ...
Selecting previously unselected package libencode-locale-perl.
Preparing to unpack .../09-libencode-locale-perl_1.05-1.1_all.deb ...
Unpacking libencode-locale-perl (1.05-1.1) ...
Selecting previously unselected package libfcgi-bin.
Preparing to unpack .../10-libfcgi-bin_2.4.2-2build2_amd64.deb ...
Unpacking libfcgi-bin (2.4.2-2build2) ...
Selecting previously unselected package libhtml-template-perl.
Preparing to unpack .../11-libhtml-template-perl_2.97-1.1_all.deb ...
Unpacking libhtml-template-perl (2.97-1.1) ...
Selecting previously unselected package libtimedate-perl.
Preparing to unpack .../12-libtimedate-perl_2.3300-2_all.deb ...
Unpacking libtimedate-perl (2.3300-2) ...
Selecting previously unselected package libhttp-date-perl.
Preparing to unpack .../13-libhttp-date-perl_6.05-1_all.deb ...
Unpacking libhttp-date-perl (6.05-1) ...
Selecting previously unselected package libio-html-perl.
Preparing to unpack .../14-libio-html-perl_1.004-2_all.deb ...
Unpacking libio-html-perl (1.004-2) ...
Selecting previously unselected package liblwp-mediatypes-perl.
Preparing to unpack .../15-liblwp-mediatypes-perl_6.04-1_all.deb ...
Unpacking liblwp-mediatypes-perl (6.04-1) ...
Selecting previously unselected package libhttp-message-perl.
Preparing to unpack .../16-libhttp-message-perl_6.36-1_all.deb ...
Unpacking libhttp-message-perl (6.36-1) ...
Selecting previously unselected package mecab-utils.
Preparing to unpack .../17-mecab-utils_0.996-14build9_amd64.deb ...
Unpacking mecab-utils (0.996-14build9) ...
Selecting previously unselected package mecab-ipadic.
Preparing to unpack .../18-mecab-ipadic_2.7.0-20070801+main-3_all.deb ...
Unpacking mecab-ipadic (2.7.0-20070801+main-3) ...
Selecting previously unselected package mecab-ipadic-utf8.
Preparing to unpack .../19-mecab-ipadic-utf8_2.7.0-20070801+main-3_all.deb ...
Unpacking mecab-ipadic-utf8 (2.7.0-20070801+main-3) ...
Selecting previously unselected package mysql-server.
Preparing to unpack .../20-mysql-server_8.0.36-0ubuntu0.22.04.1_all.deb ...
Unpacking mysql-server (8.0.36-0ubuntu0.22.04.1) ...
Setting up libmecab2:amd64 (0.996-14build9) ...
Setting up mysql-client-core-8.0 (8.0.36-0ubuntu0.22.04.1) ...
Setting up libfcgi0ldbl:amd64 (2.4.2-2build2) ...
Setting up libclone-perl (0.45-1build3) ...
Setting up libhtml-tagset-perl (3.20-4) ...
Setting up liblwp-mediatypes-perl (6.04-1) ...
Setting up libfcgi-bin (2.4.2-2build2) ...
Setting up libencode-locale-perl (1.05-1.1) ...
Setting up libprotobuf-lite23:amd64 (3.12.4-1ubuntu7.22.04.1) ...
Setting up mecab-utils (0.996-14build9) ...
Setting up libio-html-perl (1.004-2) ...
Setting up libtimedate-perl (2.3300-2) ...
Setting up mysql-client-8.0 (8.0.36-0ubuntu0.22.04.1) ...
Setting up libfcgi-perl:amd64 (0.82+ds-1build1) ...
Setting up liburi-perl (5.10-1) ...
Setting up libevent-pthreads-2.1-7:amd64 (2.1.12-stable-1build3) ...
Setting up libhttp-date-perl (6.05-1) ...
Setting up mecab-ipadic (2.7.0-20070801+main-3) ...
Compiling IPA dictionary for Mecab.  This takes long time...
reading /usr/share/mecab/dic/ipadic/unk.def ... 40
emitting double-array: 100% |###########################################|
/usr/share/mecab/dic/ipadic/model.def is not found. skipped.
reading /usr/share/mecab/dic/ipadic/Noun.demonst.csv ... 120
reading /usr/share/mecab/dic/ipadic/Noun.proper.csv ... 27328
reading /usr/share/mecab/dic/ipadic/Noun.place.csv ... 72999
reading /usr/share/mecab/dic/ipadic/Noun.csv ... 60477
reading /usr/share/mecab/dic/ipadic/Interjection.csv ... 252
reading /usr/share/mecab/dic/ipadic/Noun.adjv.csv ... 3328
reading /usr/share/mecab/dic/ipadic/Noun.org.csv ... 16668
reading /usr/share/mecab/dic/ipadic/Postp-col.csv ... 91
reading /usr/share/mecab/dic/ipadic/Noun.name.csv ... 34202
reading /usr/share/mecab/dic/ipadic/Adnominal.csv ... 135
reading /usr/share/mecab/dic/ipadic/Suffix.csv ... 1393
reading /usr/share/mecab/dic/ipadic/Noun.verbal.csv ... 12146
reading /usr/share/mecab/dic/ipadic/Conjunction.csv ... 171
reading /usr/share/mecab/dic/ipadic/Adj.csv ... 27210
reading /usr/share/mecab/dic/ipadic/Noun.number.csv ... 42
reading /usr/share/mecab/dic/ipadic/Noun.nai.csv ... 42
reading /usr/share/mecab/dic/ipadic/Prefix.csv ... 221
reading /usr/share/mecab/dic/ipadic/Postp.csv ... 146
reading /usr/share/mecab/dic/ipadic/Auxil.csv ... 199
reading /usr/share/mecab/dic/ipadic/Filler.csv ... 19
reading /usr/share/mecab/dic/ipadic/Verb.csv ... 130750
reading /usr/share/mecab/dic/ipadic/Adverb.csv ... 3032
reading /usr/share/mecab/dic/ipadic/Others.csv ... 2
reading /usr/share/mecab/dic/ipadic/Symbol.csv ... 208
reading /usr/share/mecab/dic/ipadic/Noun.adverbal.csv ... 795
reading /usr/share/mecab/dic/ipadic/Noun.others.csv ... 151
emitting double-array: 100% |###########################################|
reading /usr/share/mecab/dic/ipadic/matrix.def ... 1316x1316
emitting matrix      : 100% |###########################################|

done!
update-alternatives: using /var/lib/mecab/dic/ipadic to provide /var/lib/mecab/dic/debian (mecab-dictionary) in auto mode
Setting up mysql-server-core-8.0 (8.0.36-0ubuntu0.22.04.1) ...
Setting up mecab-ipadic-utf8 (2.7.0-20070801+main-3) ...
Compiling IPA dictionary for Mecab.  This takes long time...
reading /usr/share/mecab/dic/ipadic/unk.def ... 40
emitting double-array: 100% |###########################################|
/usr/share/mecab/dic/ipadic/model.def is not found. skipped.
reading /usr/share/mecab/dic/ipadic/Noun.demonst.csv ... 120
reading /usr/share/mecab/dic/ipadic/Noun.proper.csv ... 27328
reading /usr/share/mecab/dic/ipadic/Noun.place.csv ... 72999
reading /usr/share/mecab/dic/ipadic/Noun.csv ... 60477
reading /usr/share/mecab/dic/ipadic/Interjection.csv ... 252
reading /usr/share/mecab/dic/ipadic/Noun.adjv.csv ... 3328
reading /usr/share/mecab/dic/ipadic/Noun.org.csv ... 16668
reading /usr/share/mecab/dic/ipadic/Postp-col.csv ... 91
reading /usr/share/mecab/dic/ipadic/Noun.name.csv ... 34202
reading /usr/share/mecab/dic/ipadic/Adnominal.csv ... 135
reading /usr/share/mecab/dic/ipadic/Suffix.csv ... 1393
reading /usr/share/mecab/dic/ipadic/Noun.verbal.csv ... 12146
reading /usr/share/mecab/dic/ipadic/Conjunction.csv ... 171
reading /usr/share/mecab/dic/ipadic/Adj.csv ... 27210
reading /usr/share/mecab/dic/ipadic/Noun.number.csv ... 42
reading /usr/share/mecab/dic/ipadic/Noun.nai.csv ... 42
reading /usr/share/mecab/dic/ipadic/Prefix.csv ... 221
reading /usr/share/mecab/dic/ipadic/Postp.csv ... 146
reading /usr/share/mecab/dic/ipadic/Auxil.csv ... 199
reading /usr/share/mecab/dic/ipadic/Filler.csv ... 19
reading /usr/share/mecab/dic/ipadic/Verb.csv ... 130750
reading /usr/share/mecab/dic/ipadic/Adverb.csv ... 3032
reading /usr/share/mecab/dic/ipadic/Others.csv ... 2
reading /usr/share/mecab/dic/ipadic/Symbol.csv ... 208
reading /usr/share/mecab/dic/ipadic/Noun.adverbal.csv ... 795
reading /usr/share/mecab/dic/ipadic/Noun.others.csv ... 151
emitting double-array: 100% |###########################################|
reading /usr/share/mecab/dic/ipadic/matrix.def ... 1316x1316
emitting matrix      : 100% |###########################################|

done!
update-alternatives: using /var/lib/mecab/dic/ipadic-utf8 to provide /var/lib/mecab/dic/debian (mecab-dictionary) in auto mode
Setting up libhtml-parser-perl:amd64 (3.76-1build2) ...
Setting up libhttp-message-perl (6.36-1) ...
Setting up mysql-server-8.0 (8.0.36-0ubuntu0.22.04.1) ...
update-alternatives: using /etc/mysql/mysql.cnf to provide /etc/mysql/my.cnf (my.cnf) in auto mode
Renaming removed key_buffer and myisam-recover options (if present)
mysqld will log errors to /var/log/mysql/error.log
mysqld is running as pid 2479
Created symlink /etc/systemd/system/multi-user.target.wants/mysql.service → /lib/systemd/system/mysql.service.
Setting up libcgi-pm-perl (4.54-1) ...
Setting up libhtml-template-perl (2.97-1.1) ...
Setting up mysql-server (8.0.36-0ubuntu0.22.04.1) ...
Setting up libcgi-fast-perl (1:2.15-1) ...
Processing triggers for man-db (2.10.2-1) ...
Processing triggers for libc-bin (2.35-0ubuntu3.1) ...
Scanning processes...
Scanning linux images...

Running kernel seems to be up-to-date.

No services need to be restarted.

No containers need to be restarted.

No user sessions are running outdated binaries.

No VM guests are running outdated hypervisor (qemu) binaries on this host.


root@cv3561837:~/main_directory# sudo wget https://download.docker.com/linux/ubuntu/dists/jammy/pool/stable/amd64/docker-ce-cli_20.10.13~3-0~ubuntu-jammy_amd64.deb
--2024-02-06 19:39:26--  https://download.docker.com/linux/ubuntu/dists/jammy/pool/stable/amd64/docker-ce-cli_20.10.13~3-0~ubuntu-jammy_amd64.deb
Resolving download.docker.com (download.docker.com)... 18.239.94.55, 18.239.94.73, 18.239.94.127, ...
Connecting to download.docker.com (download.docker.com)|18.239.94.55|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: 40955778 (39M) [binary/octet-stream]
Saving to: ‘docker-ce-cli_20.10.13~3-0~ubuntu-jammy_amd64.deb’

docker-ce-cli_20.10.1 100%[=======================>]  39.06M  25.3MB/s    in 1.5s

2024-02-06 19:39:28 (25.3 MB/s) - ‘docker-ce-cli_20.10.13~3-0~ubuntu-jammy_amd64.deb’ saved [40955778/40955778]


root@cv3561837:~/main_directory# sudo dpkg -i docker-ce-cli_20.10.13~3-0~ubuntu-jammy_amd64.deb
Selecting previously unselected package docker-ce-cli.
(Reading database ... 65472 files and directories currently installed.)
Preparing to unpack docker-ce-cli_20.10.13~3-0~ubuntu-jammy_amd64.deb ...
Unpacking docker-ce-cli (5:20.10.13~3-0~ubuntu-jammy) ...
Setting up docker-ce-cli (5:20.10.13~3-0~ubuntu-jammy) ...
Processing triggers for man-db (2.10.2-1) ...
root@cv3561837:~/main_directory# sudo dpkg -r docker-ce-cli
(Reading database ... 65670 files and directories currently installed.)
Removing docker-ce-cli (5:20.10.13~3-0~ubuntu-jammy) ...
Processing triggers for man-db (2.10.2-1) ...
root@cv3561837:~/main_directory#

