/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2020/2/23 18:33:09                           */
/*==============================================================*/


drop table if exists lesson;

drop table if exists manager;

drop table if exists price;

drop table if exists rank;

drop table if exists status;

drop table if exists student;

drop table if exists studentsubject;

drop table if exists studenttime;

drop table if exists subject;

drop table if exists teacher;

drop table if exists teachertime;

/*==============================================================*/
/* Table: lesson                                                */
/*==============================================================*/
create table lesson
(
   OrderId              varchar(1024) not null,
   SubjectId            int,
   StudentId            int,
   PriceId              int,
   StausId              varchar(1024),
   TeacherId            int,
   OrderStarttime       time not null,
   OrderTime            int not null,
   primary key (OrderId)
);

/*==============================================================*/
/* Table: manager                                               */
/*==============================================================*/
create table manager
(
   ManageId             int not null,
   ManagePhone          varchar(1024) not null,
   ManageName           varchar(1024) not null,
   ManagePassword       varchar(1024) not null,
   ManageRole           varchar(1024) not null
);

/*==============================================================*/
/* Table: price                                                 */
/*==============================================================*/
create table price
(
   PriceId              int not null,
   SubjectId            int,
   OrderId              varchar(1024),
   Price                int not null,
   primary key (PriceId)
);

/*==============================================================*/
/* Table: rank                                                  */
/*==============================================================*/
create table rank
(
   RankId               int not null,
   PriceId              int,
   RankName             varchar(1024) not null,
   primary key (RankId)
);

/*==============================================================*/
/* Table: status                                                */
/*==============================================================*/
create table status
(
   StausId              varchar(1024) not null,
   StatusName           varchar(1024) not null,
   primary key (StausId)
);

/*==============================================================*/
/* Table: student                                               */
/*==============================================================*/
create table student
(
   StudentId            int not null,
   StudentName          varchar(1024) not null,
   StudentSex           varchar(1024) not null,
   StudentGrade         varchar(1024) not null,
   StudentAddress       varchar(1024) not null,
   StudentPhone         varchar(1024) not null,
   StudentImage         varchar(1024) not null,
   StudentPassword      varchar(1024) not null,
   StudentIntegral      varchar(1024) not null,
   StudentRole          int not null,
   StudentNickname      varchar(1024) not null,
   StudentMoney         varchar(1024) not null,
   primary key (StudentId)
);

/*==============================================================*/
/* Table: studentsubject                                        */
/*==============================================================*/
create table studentsubject
(
   StudentId            int not null,
   SubjectId            int not null,
   primary key (StudentId, SubjectId)
);

/*==============================================================*/
/* Table: studenttime                                           */
/*==============================================================*/
create table studenttime
(
   StudentTimeid        int not null,
   StudentId            int,
   TimeRoleid           int not null,
   TimeFree             int not null,
   primary key (StudentTimeid)
);

/*==============================================================*/
/* Table: subject                                               */
/*==============================================================*/
create table subject
(
   SubjectId            int not null,
   SubjectName          varchar(1024) not null,
   SubjectType          varchar(1024) not null,
   primary key (SubjectId)
);

/*==============================================================*/
/* Table: teacher                                               */
/*==============================================================*/
create table teacher
(
   TeacherId            int not null,
   SubjectId            int,
   RankId               int,
   TeacherName          national varchar(255) not null,
   TeacherSex           varchar(1024) not null,
   TeacherPhone         varchar(1024) not null,
   TeacherPassword      varchar(1024) not null,
   TeacherAddress       varchar(1024) not null,
   TeacherInformation   varchar(1024) not null,
   TeacherInformatonpic varchar(1024) not null,
   TeacherImage         varchar(1024) not null,
   TeacherPhoto         varchar(1024) not null,
   TeacherCardid        varchar(1024) not null,
   TeacherCardpic       varchar(1024) not null,
   TeacherUniversity    varchar(1024) not null,
   TeacherIntegral      varchar(1024) not null,
   TeacherSubjectid     int not null,
   TeacherDescription   varchar(1024) not null,
   TeaherRole           int not null,
   TeacherRankid        varchar(1024) not null,
   TeacherMoney         varchar(1024) not null,
   primary key (TeacherId)
);

/*==============================================================*/
/* Table: teachertime                                           */
/*==============================================================*/
create table teachertime
(
   TimeId               int not null,
   TeacherId            int,
   TimeFree             int not null,
   TimeRoleid           int not null,
   primary key (TimeId)
);

alter table lesson add constraint FK_Relationship_13 foreign key (PriceId)
      references price (PriceId) on delete restrict on update restrict;

alter table lesson add constraint FK_Relationship_5 foreign key (StudentId)
      references student (StudentId) on delete restrict on update restrict;

alter table lesson add constraint FK_Relationship_8 foreign key (SubjectId)
      references subject (SubjectId) on delete restrict on update restrict;

alter table lesson add constraint FK_order2 foreign key (TeacherId)
      references teacher (TeacherId) on delete restrict on update restrict;

alter table lesson add constraint FK_order3 foreign key (StausId)
      references status (StausId) on delete restrict on update restrict;

alter table price add constraint FK_Relationship_14 foreign key (OrderId)
      references lesson (OrderId) on delete restrict on update restrict;

alter table price add constraint FK_Relationship_9 foreign key (SubjectId)
      references subject (SubjectId) on delete restrict on update restrict;

alter table rank add constraint FK_Relationship_10 foreign key (PriceId)
      references price (PriceId) on delete restrict on update restrict;

alter table studentsubject add constraint FK_studentsubject foreign key (StudentId)
      references student (StudentId) on delete restrict on update restrict;

alter table studentsubject add constraint FK_studentsubject2 foreign key (SubjectId)
      references subject (SubjectId) on delete restrict on update restrict;

alter table studenttime add constraint FK_Relationship_12 foreign key (StudentId)
      references student (StudentId) on delete restrict on update restrict;

alter table teacher add constraint FK_Rank foreign key (RankId)
      references rank (RankId) on delete restrict on update restrict;

alter table teacher add constraint FK_teach foreign key (SubjectId)
      references subject (SubjectId) on delete restrict on update restrict;

alter table teachertime add constraint FK_Relationship_11 foreign key (TeacherId)
      references teacher (TeacherId) on delete restrict on update restrict;

