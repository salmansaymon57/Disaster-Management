create database DisasterManagement

create table Disaster(

 Id int IDENTITY(1,1) Primary key not null,
 DisasterId int  not null,
 DisasterName varchar(50) not null,
 DisasterType varchar(50) not null,



)


create table Casuality(

 Id int IDENTITY(1,1)  not null,
 Injured int not null,
 Missing int not null,
 Death int not null


)



insert into Disaster(DisasterName,DisasterType) values('Flood','Natural')
insert into Disaster(DisasterName,DisasterType) values('Cyclone','Natural')
insert into Disaster(DisasterName,DisasterType) values('Fire','Manmade')
insert into Disaster(DisasterName,DisasterType) values('Accident','Manmade')


insert into Region(RegionName) values('Dhaka')
insert into Region(RegionName) values(2,'Ctg',2)
insert into Region(RegionName) values(3,'Raj',3)
insert into Region(RegionName) values(4,'Khulna',4)


insert into Casuality (Injured,Missing,Death) values (210,100,12123)
insert into Casuality (Injured,Missing,Death) values (2,2,2,211,100,113)
insert into Casuality (Injured,Missing,Death) values (3,3,3,20,00,23)
insert into Casuality (Injured,Missing,Death) values (4,4,4,201,10100,1123)


create table Region(

Id int IDENTITY(1,1)  not null,
RegionName varchar(50) not null,



)

create table Details(

Id int IDENTITY(1,1)  not null,
Yearr int not null,
EconomicDamage float not null,

)

insert into Details(Yearr,EconomicDamage) values(2010,40000)




create table ReliefAid(

   Id int IDENTITY(1,1)  not null,
   TotalAmount float not null,
   ContributingCountries int not null

)

insert into ReliefAid (TotalAmount,ContributingCountries) values(10000000,2)
insert into ReliefAid (TotalAmount,ContributingCountries) values(10000000.00,3)
insert into ReliefAid (TotalAmount,ContributingCountries) values(3,3,10000000.00,1)
insert into ReliefAid (TotalAmount,ContributingCountries) values(4,4,10000000.00,4)



select*from  Disaster
select *from Region
select *from Casuality
select *from Details
select *from ReliefAid



select DisasterName,DisasterType,RegionName,Injured,Missing,Death,Yearr,EconomicDamage,TotalAmount,ContributingCountries
from Disaster

inner join Region
on disaster.Id=region.Id

inner join Casuality
on disaster.Id=casuality.Id

inner join Details
on disaster.Id=Details.Id

inner join ReliefAid
on disaster.Id=ReliefAid.Id
where RegionName like '%Dhaka%'





	 alter table Disaster
  drop column Category

  ALTER TABLE Region

DROP CONSTRAINTpk_RegionId;

ALTER TABLE Region

DROP PRIMARY KEY;

Drop Table Casuality
Drop Table Disaster
drop table Region
drop table ReliefAid
drop table Details

DELETE FROM Disaster where DisasterId=
DELETE FROM Region where DisasterId=
DELETE FROM Casuality where DisasterId=
DELETE FROM Details where DisasterId=
DELETE FROM ReliefAid where DisasterId=