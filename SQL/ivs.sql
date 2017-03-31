/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     3/31/2017 5:06:27 PM                         */
/*==============================================================*/


drop table if exists CHONG;

drop table if exists CM;

drop table if exists HONNHAN;

drop table if exists QUYEN;

drop table if exists TAIKHOAN;

drop table if exists TAIKHOAN_QUYEN;

drop table if exists VO;

/*==============================================================*/
/* Table: CHONG                                                 */
/*==============================================================*/
create table CHONG
(
   CHONG_ID             int not null,
   CM_ID                int,
   HN_ID                int,
   primary key (CHONG_ID)
);

/*==============================================================*/
/* Table: CM                                                    */
/*==============================================================*/
create table CM
(
   CM_ID                int not null,
   CM_TEN               varchar(50) not null,
   CM_NGAYSINH          date not null,
   CM_CMNN              varchar(50) not null,
   CM_NOICAP            varchar(100) not null,
   CM_NGAYCAP           date not null,
   CM_QUOCTICH          varchar(50) not null,
   CM_DANTOC            varchar(50) not null,
   CM_SOLANKETHON       tinyint not null,
   CM_DIACHI            varchar(100) not null,
   primary key (CM_ID)
);

/*==============================================================*/
/* Table: HONNHAN                                               */
/*==============================================================*/
create table HONNHAN
(
   HN_ID                int not null,
   TK_ID                int,
   HN_TINHTRANG         varchar(50) not null,
   HN_TRANGTHAI         varchar(50) not null,
   HN_NGAYDUYET         date,
   primary key (HN_ID)
);

/*==============================================================*/
/* Table: QUYEN                                                 */
/*==============================================================*/
create table QUYEN
(
   Q_ID                 int not null,
   Q_QUYEN              varchar(50) not null,
   primary key (Q_ID)
);

/*==============================================================*/
/* Table: TAIKHOAN                                              */
/*==============================================================*/
create table TAIKHOAN
(
   TK_ID                int not null,
   TK_USERNAME          varchar(50) not null,
   TK_PASSWORD          varchar(50) not null,
   primary key (TK_ID)
);

/*==============================================================*/
/* Table: TAIKHOAN_QUYEN                                        */
/*==============================================================*/
create table TAIKHOAN_QUYEN
(
   TK_ID                int not null,
   Q_ID                 int not null,
   primary key (TK_ID, Q_ID)
);

/*==============================================================*/
/* Table: VO                                                    */
/*==============================================================*/
create table VO
(
   VO_ID                int not null,
   CM_ID                int,
   HN_ID                int,
   primary key (VO_ID)
);

alter table CHONG add constraint FK_CM_CHONG foreign key (CM_ID)
      references CM (CM_ID) on delete restrict on update restrict;

alter table CHONG add constraint FK_CUOIVO foreign key (HN_ID)
      references HONNHAN (HN_ID) on delete restrict on update restrict;

alter table HONNHAN add constraint FK_DUYET_HN foreign key (TK_ID)
      references TAIKHOAN (TK_ID) on delete restrict on update restrict;

alter table TAIKHOAN_QUYEN add constraint FK_TAIKHOAN_QUYEN foreign key (TK_ID)
      references TAIKHOAN (TK_ID) on delete restrict on update restrict;

alter table TAIKHOAN_QUYEN add constraint FK_TAIKHOAN_QUYEN2 foreign key (Q_ID)
      references QUYEN (Q_ID) on delete restrict on update restrict;

alter table VO add constraint FK_CM_VO foreign key (CM_ID)
      references CM (CM_ID) on delete restrict on update restrict;

alter table VO add constraint FK_LAYCHONG foreign key (HN_ID)
      references HONNHAN (HN_ID) on delete restrict on update restrict;

