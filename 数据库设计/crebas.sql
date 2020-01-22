/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2020/1/22 11:38:23                           */
/*==============================================================*/


drop table if exists Lesson;

drop table if exists Status;

drop table if exists Student;

drop table if exists Subject;

drop table if exists Teacher;

drop table if exists rank;

drop table if exists studentsubject;

/*==============================================================*/
/* User: User_1                                                 */
/*==============================================================*/


/*==============================================================*/
/* Table: Lesson                                                */
/*==============================================================*/
create table Lesson
(
   OrderId              int not null,
   SubjectId            int,
   StudentId            int,
   StausId              int,
   TeacherId            int,
   OrderStarttime       time not null,
   OrderTime            int not null,
   OrderPrice           int not null,
   primary key (OrderId)
);

/*==============================================================*/
/* Table: Status                                                */
/*==============================================================*/
create table Status
(
   StausId              varchar(1024) not null,
   StatusName           varchar(1024) not null,
   primary key (StausId)
);

/*==============================================================*/
/* Table: Student                                               */
/*==============================================================*/
create table Student
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
   primary key (StudentId)
);

/*==============================================================*/
/* Table: Subject                                               */
/*==============================================================*/
create table Subject
(
   SubjectId            int not null,
   SubjectName          varchar(1024) not null,
   SubjectType          varchar(1024) not null,
   primary key (SubjectId)
);

/*==============================================================*/
/* Table: Teacher                                               */
/*==============================================================*/
create table Teacher
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
   TeacherSubtype       varchar(1024) not null,
   TeacherDescription   varchar(1024) not null,
   primary key (TeacherId)
);

/*==============================================================*/
/* Table: rank                                                  */
/*==============================================================*/
create table rank
(
   RankId               int not null,
   RankName             varchar(1024) not null,
   primary key (RankId)
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

alter table User_1.Lesson add constraint FK_Relationship_5 foreign key (StudentId)
      references Student (StudentId) on delete restrict on update restrict;

alter table User_1.Lesson add constraint FK_Relationship_8 foreign key (SubjectId)
      references Subject (SubjectId) on delete restrict on update restrict;

alter table User_1.Lesson add constraint FK_order2 foreign key (TeacherId)
      references Teacher (TeacherId) on delete restrict on update restrict;

alter table User_1.Lesson add constraint FK_order3 foreign key (StausId)
      references Status (StausId) on delete restrict on update restrict;

alter table Teacher add constraint FK_Rank foreign key (RankId)
      references rank (RankId) on delete restrict on update restrict;

alter table Teacher add constraint FK_teach foreign key (SubjectId)
      references Subject (SubjectId) on delete restrict on update restrict;

alter table studentsubject add constraint FK_studentsubject foreign key (StudentId)
      references Student (StudentId) on delete restrict on update restrict;

alter table studentsubject add constraint FK_studentsubject2 foreign key (SubjectId)
      references Subject (SubjectId) on delete restrict on update restrict;

