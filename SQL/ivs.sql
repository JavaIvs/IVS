/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     4/7/2017 1:14:18 PM                          */
/*==============================================================*/


drop table if exists DONDANGKYKETHON;

drop table if exists HONNHAN;

drop table if exists USER;

/*==============================================================*/
/* Table: DONDANGKYKETHON                                       */
/*==============================================================*/
create table DONDANGKYKETHON
(
   DDKKH_ID             int not null,
   HN_ID                int,
   DDKKH_CMND           varchar(50) not null,
   DDKKH_NGAYDK         date not null,
   DDKKH_NGAYHEN        date not null,
   DDKKH_NGAYNHAN       date,
   DDKKH_GHICHU         varchar(50),
   primary key (DDKKH_ID)
);

/*==============================================================*/
/* Table: HONNHAN                                               */
/*==============================================================*/
create table HONNHAN
(
   HN_ID                int not null,
   U_ID                 int,
   DDKKH_ID             int,
   HN_NOIDANGKY         varchar(50) not null,
   HN_TRANGTHAI         varchar(50) not null,
   NAM_HOTEN            varchar(50) not null,
   NAM_NGAYSINH         date not null,
   NAM_DANTOC           varchar(50) not null,
   NAM_QUOCTICH         varchar(50) not null,
   NAM_NOICUTRU         varchar(50) not null,
   NAM_CMND             varchar(50) not null,
   NU_HOTEN             varchar(50) not null,
   NU_NGAYSINH          date not null,
   NU_DANTOC            varchar(50) not null,
   NU_QUOCTICH          varchar(50) not null,
   NU_NOICUTRU          varchar(50) not null,
   NU_CMND              varchar(50) not null,
   primary key (HN_ID)
);

/*==============================================================*/
/* Table: USER                                                  */
/*==============================================================*/
create table USER
(
   U_ID                 int not null,
   U_NAME               varchar(50) not null,
   U_PASS               varchar(50) not null,
   primary key (U_ID)
);

alter table DONDANGKYKETHON add constraint FK_CO foreign key (HN_ID)
      references HONNHAN (HN_ID) on delete restrict on update restrict;

alter table HONNHAN add constraint FK_CO2 foreign key (DDKKH_ID)
      references DONDANGKYKETHON (DDKKH_ID) on delete restrict on update restrict;

alter table HONNHAN add constraint FK_DUYET foreign key (U_ID)
      references USER (U_ID) on delete restrict on update restrict;

