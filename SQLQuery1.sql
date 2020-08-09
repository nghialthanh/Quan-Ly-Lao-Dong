﻿use master
create database QLLD
on primary
( 
  size = 5,filegrowth = 2,maxsize = 100,filename = 'D:\12\QLLD.mdf',name = QLLD
)
log on
(
  size = 5,filegrowth = 2,maxsize = 100,filename = 'D:\12\QLLD_log.ldf',name = QLLD_log
)
go
use QLLD
/*--------------------------	Start auto ma---------------------------*/
-- default ma NV--
CREATE FUNCTION AUTO_MaNV()
RETURNS VARCHAR(10)
AS
BEGIN
	DECLARE @ID VARCHAR(10)
	IF ((SELECT COUNT(MaNV) FROM NhanVien) = 0)
		SET @ID = '0'
	ELSE
		SELECT @ID=MAX(RIGHT(MaNV,4)) FROM NhanVien
		SELECT @ID = CASE
			WHEN @ID >= 0 and @ID < 9 THEN 'NV000' + CONVERT(varCHAR(4), CONVERT(INT, @ID) + 1)
			WHEN @ID >= 9 and @ID <99 THEN 'NV00' + CONVERT(varCHAR(4), CONVERT(INT, @ID) + 1)
			WHEN @ID >= 99 and @ID <999 THEN 'NV0' + CONVERT(varCHAR(4), CONVERT(INT, @ID) + 1)
			WHEN @ID >= 999 THEN 'NV' + CONVERT(varCHAR(4), CONVERT(INT, @ID) + 1)
		END
	RETURN @ID
END
go
-- default ma CT--
CREATE FUNCTION AUTO_MaCT()
RETURNS VARCHAR(10)
AS
BEGIN
	DECLARE @ID VARCHAR(10)
	IF ((SELECT COUNT(MaCT) FROM CongTrinh) = 0)
		SET @ID = '0'
	ELSE
		SELECT @ID=MAX(RIGHT(MaCT,3)) FROM CongTrinh
		SELECT @ID = CASE
			WHEN @ID >= 0 and @ID < 9 THEN 'CT00' + CONVERT(varCHAR(4), CONVERT(INT, @ID) + 1)
			WHEN @ID >= 9 and @ID <99 THEN 'CT0' + CONVERT(varCHAR(4), CONVERT(INT, @ID) + 1)
			WHEN @ID >= 99 and @ID <999 THEN 'CT' + CONVERT(varCHAR(4), CONVERT(INT, @ID) + 1)
		END
	RETURN @ID
END
go
-- default ma DA--
CREATE FUNCTION AUTO_MaDA()
RETURNS VARCHAR(10)
AS
BEGIN
	DECLARE @ID VARCHAR(10)
	IF ((SELECT COUNT(MaDA) FROM DuAn) = 0)
		SET @ID = '0'
	ELSE
		SELECT @ID=MAX(RIGHT(MaDA,3)) FROM DuAn
		SELECT @ID = CASE
			WHEN @ID >= 0 and @ID < 9 THEN 'DA00' + CONVERT(varCHAR(4), CONVERT(INT, @ID) + 1)
			WHEN @ID >= 9 and @ID <99 THEN 'DA0' + CONVERT(varCHAR(4), CONVERT(INT, @ID) + 1)
			WHEN @ID >= 99 and @ID <999 THEN 'DA' + CONVERT(varCHAR(4), CONVERT(INT, @ID) + 1)
		END
	RETURN @ID
END
go
-- default ma DieuDong--
CREATE FUNCTION AUTO_MaDD()
RETURNS VARCHAR(10)
AS
BEGIN
	DECLARE @ID VARCHAR(10)
	IF ((SELECT COUNT(MaDD) FROM DieuDong) = 0)
		SET @ID = '0'
	ELSE
		SELECT @ID=MAX(RIGHT(MaDD,3)) FROM DieuDong
		SELECT @ID = CASE
			WHEN @ID >= 0 and @ID < 9 THEN 'DD00' + CONVERT(varCHAR(4), CONVERT(INT, @ID) + 1)
			WHEN @ID >= 9 and @ID <99 THEN 'DD0' + CONVERT(varCHAR(4), CONVERT(INT, @ID) + 1)
			WHEN @ID >= 99 and @ID <999 THEN 'DD' + CONVERT(varCHAR(4), CONVERT(INT, @ID) + 1)
		END
	RETURN @ID
END
go
-- Set Ngay Cong NV --
/*create FUNCTION NgayCong(@maNV varCHAR(10))
return int
AS
BEGIN
	DECLARE @COUNT int
	SELECT @COUNT = count(MaNV)
	from ChamCong
	where @maNV= MaNV
	return @count
End
*/
/*--------------------------	end auto ma---------------------------*/
/*-------------------------- Start Tao Bang----------------------------*/
/*BAng Nhan Vien*/
CREATE TABLE NhanVien (
    MaNV varchar(10) PRIMARY KEY CONSTRAINT IDNV default dbo.AUTO_MaNV(),
	TenNV nvarchar(50),
    NgaySinh date,
    GioiTinh nchar(3),
    DiaChi nvarchar(100),
	MaPB varchar(10)
);
/*BAng PhongBan*/
CREATE TABLE PhongBan (
	MaPB varchar(10)  not null,
	TenPB nvarchar(30),
	MaTPB varchar(10)
	primary key (MaPB)
);
/*BAng TruongPhongBan*/
CREATE TABLE TruongPhongBan (
	MaTPB varchar(10) primary key not null,
	TenTPB nvarchar(30),
	TaiKhoanTPB varchar(30)

);
/*BAng Account*/
CREATE TABLE Account (
	TaiKhoan varchar(30) primary key not null,
	MatKhau varchar(16),
	ChucVu nvarchar(30),
	Anh image
);
/*BAng NhanVienQLDA*/
CREATE TABLE NhanVienQLDA (
    MaNVQLDA varchar(10) primary key not null,
	TenNVQLDA nvarchar(50),
    NgaySinh date,
    GioiTinh nchar(3),
    DiaChi nvarchar(100),
	TaiKhoanQLDA varchar(30)
);
/*BAng DuAn*/
CREATE TABLE DuAn (
    MaDA varchar(10) PRIMARY KEY CONSTRAINT IDDA default dbo.AUTO_MaDA(),
	TenDA nvarchar(50),
	MaNVQLDA varchar(10)
);
/*BAng CongTrinh*/
CREATE TABLE CongTrinh(
    MaCT varchar(10) PRIMARY KEY CONSTRAINT IDCT default dbo.AUTO_MaCT(),
	TenCT nvarchar(50),
	DiaDiem nvarchar(100),
	NgayKhoiCong date,
	NgayKetThuc date,
	NgayCapPhepXD date,
	TrangThai nvarchar(20),
	MaDA varchar(10),
);
/*Bang ChamCong*/
CREATE TABLE ChamCong(
	MaNV varCHAR(10),
	MaCT varchar(10),
	NgayChamCong Datetime
	primary key (MaNV,MaCT,NgayChamCong)
)
/*BAng CongViec*/
CREATE TABLE CongViec(
    MaCT varchar(10) not null,
	MaNV varchar(10) not null,
	TenCV nvarchar(25),
	Ngaybatdau Datetime,
	NgayDung Datetime,
	primary key (MaCT,MaNV,TenCV)
);
/*Bang ChuyenCongTac*/
create table DieuDong(
	MaDD varchar(10) PRIMARY KEY CONSTRAINT IDDD default dbo.AUTO_MaDD(),
	MaNV varchar(10) not null,
	MaCTcu varchar(10) not null,
	MaCTmoi varchar(10) not null,
	ngaychuyen Datetime not null,
)
/*---------------------------- End Tao Bang---------------------------------------- */


/*--------------------------	Start Tao Khoa Phu---------------------------*/
-- MaPB ( NhanVien ) ---------- MaPB ( PhongBan )---
ALTER TABLE NhanVien ADD CONSTRAINT fk_NV_PB FOREIGN KEY (MaPB) REFERENCES PhongBan (MaPB);

-- MaTPB ( Phong Ban ) ---------- MaTPB ( Truong PhongB an)---
ALTER TABLE PhongBan ADD CONSTRAINT fk_PB_TPB FOREIGN KEY (MaTPB) REFERENCES TruongPhongBan (MaTPB);

-- TaiKhoanTPB (TruongPhongBan) ---------- TaiKhoan (Account)---
ALTER TABLE TruongPhongBan ADD CONSTRAINT fk_TPB_Acc FOREIGN KEY (TaiKhoanTPB) REFERENCES Account (TaiKhoan);

-- MaPB(NhanVien) ---------- MaPB(PhongBan)---
ALTER TABLE NhanVienQLDA ADD CONSTRAINT fk_NVQLDA_ACC FOREIGN KEY (TaiKhoanQLDA) REFERENCES Account (TaiKhoan);

-- MaNVQLDA ( DuAn ) ---------- MaNVQLDA (NhanVienQLDA)---
ALTER TABLE DuAn ADD CONSTRAINT fk_DA_NVQLDA FOREIGN KEY (MaNVQLDA) REFERENCES NhanVienQLDA (MaNVQLDA);

-- MaCT ( DuAn ) ---------- CongTrinh (MaCT)---
ALTER TABLE CongTrinh ADD CONSTRAINT fk_CT_DA FOREIGN KEY (MaDA) REFERENCES DuAn (MaDA);

-- MaNV ( CongViec ) ---------- MaNV (NhanVien)---
ALTER TABLE CongViec ADD CONSTRAINT fk_CV_NV FOREIGN KEY (MaNV) REFERENCES NhanVien (MaNV);

-- MaCT ( CongViec ) ---------- MaCT (CongTrinh)---
ALTER TABLE CongViec ADD CONSTRAINT fk_CV_CT FOREIGN KEY (MaCT) REFERENCES CongTrinh (MaCT);

-- MaCT ( ChamCong ) ---------- MaCT (CongTrinh)---
ALTER TABLE ChamCong ADD CONSTRAINT fk_CC_CT FOREIGN KEY (MaCT) REFERENCES CongTrinh (MaCT);

-- MaNV ( ChamCong ) ---------- MaNV (NhanVien)---
ALTER TABLE ChamCong ADD CONSTRAINT fk_CC_NV FOREIGN KEY (MaNV) REFERENCES NhanVien (MaNV)

-- MaNV ( DieuDong ) ---------- MaNV (NhanVien)---
ALTER TABLE DieuDong ADD CONSTRAINT fk_DD_NV FOREIGN KEY (MaNV) REFERENCES NhanVien (MaNV)

-- MaCTcu ( DieuDong ) ---------- MaCT (CongTrinh)---
ALTER TABLE DieuDong ADD CONSTRAINT fk_DD_CT1 FOREIGN KEY (MaCTcu) REFERENCES CongTrinh (MaCT)

-- MaCTmoi ( DieuDong ) ---------- MaCT (CongTrinh)---
ALTER TABLE DieuDong ADD CONSTRAINT fk_DD_CT2 FOREIGN KEY (MaCTmoi) REFERENCES CongTrinh (MaCT)

/*--------------------------	End Tao Khoa Phu---------------------------*/

							-- Insert dữ liệu cho bảng Account --
insert into Account(TaiKhoan,MatKhau,ChucVu,Anh)
values ('ThanhNghia','123456','Nhan vien QLDA','')
insert into Account(TaiKhoan,MatKhau,ChucVu,Anh)
values ('VietTuong','123456789','Nhan vien QLDA','')
insert into Account(TaiKhoan,MatKhau,ChucVu,Anh)
values ('TrongHinh','987654321','Nhan vien QLDA','')
insert into Account(TaiKhoan,MatKhau,ChucVu,Anh)
values ('NVPB1','abcdef','Truong Phong Ban','')
insert into Account(TaiKhoan,MatKhau,ChucVu,Anh)
values ('NVPB2','abcdef','Truong Phong Ban','')

							-- Insert dữ liệu cho bảng NhanVienQLDA --
insert into NhanVienQLDA(MaNVQLDA,TenNVQLDA,NgaySinh,GioiTinh,DiaChi,TaiKhoanQLDA)
values ('NVQL01',N'Thành Nghĩa','1999-10-01','Nam',N'Thanh Tịnh,TP Huế','ThanhNghia')
insert into NhanVienQLDA(MaNVQLDA,TenNVQLDA,NgaySinh,GioiTinh,DiaChi,TaiKhoanQLDA)
values ('NVQL02',N'Việt Tường','1999-01-01','Nam',N'Thanh Khê,TP Đà Nẵng','VietTuong')
insert into NhanVienQLDA(MaNVQLDA,TenNVQLDA,NgaySinh,GioiTinh,DiaChi,TaiKhoanQLDA)
values ('NVQL03',N'Trọng Hinh','1999-12-28','Nam',N'Mai Chí Thọ,TP HCM','TrongHinh')

							-- Insert dữ liệu cho bảng DuAn--
--1--
insert into DuAn(TenDA,MaNVQLDA)
values (N'Khu Đô Thị','NVQL02')

--2--
insert into DuAn(TenDA,MaNVQLDA)
values (N'Từ Thiện','NVQL03')

--3--
insert into DuAn(TenDA,MaNVQLDA)
values (N'Phát Triển Huyện','NVQL01')

					-- Insert dữ liệu cho bảng CongTrinh --
insert into CongTrinh(TenCT,DiaDiem,NgayKhoiCong,NgayKetThuc,NgayCapPhepXD,TrangThai,MaDA)
values (N'Chung cư Galaxy 1',N'Hồ Chí Minh','2018-02-20','2019-05-05','2018-02-10',N'Hoàn Thành','DA001')
insert into CongTrinh(TenCT,DiaDiem,NgayKhoiCong,NgayKetThuc,NgayCapPhepXD,TrangThai,MaDA)
values (N'Chung cư Alibaba',N'Hồ Chí Minh','2018-05-05','2019-05-05','2019-04-28',N'Hoàn Thành','DA001')
insert into CongTrinh(TenCT,DiaDiem,NgayKhoiCong,NgayKetThuc,NgayCapPhepXD,TrangThai,MaDA)
values (N'Bãi đỗ xe 3 tầng',N'Hà Nội','2019-02-28','2019-11-20','2019-02-13',N'Đang thi công','DA001')
insert into CongTrinh(TenCT,DiaDiem,NgayKhoiCong,NgayKetThuc,NgayCapPhepXD,TrangThai,MaDA)
values (N'Nhà tình thương 1',N'Hồ Chí Minh','2019-03-03','2019-12-22','2019-02-02',N'Đang thi công','DA002')
insert into CongTrinh(TenCT,DiaDiem,NgayKhoiCong,NgayKetThuc,NgayCapPhepXD,TrangThai,MaDA)
values (N'Nhà tình thương 2',N'Đà Nẵng','2019-01-01','2019-09-30','2018-12-20',N'Hoàn Thành','DA002')
insert into CongTrinh(TenCT,DiaDiem,NgayKhoiCong,NgayKetThuc,NgayCapPhepXD,TrangThai,MaDA)
values (N'Nhà tình thương 3',N'Cần Thơ','2019-02-25','2019-05-03','2019-02-21',N'Hoàn Thành','DA002')
insert into CongTrinh(TenCT,DiaDiem,NgayKhoiCong,NgayKetThuc,NgayCapPhepXD,TrangThai,MaDA)
values (N'Nhà văn hóa',N'Hồ Chí Minh','2018-10-10','2019-10-01','2018-10-02',N'Hoàn Thành','DA003')
insert into CongTrinh(TenCT,DiaDiem,NgayKhoiCong,NgayKetThuc,NgayCapPhepXD,TrangThai,MaDA)
values (N'Trường tiểu học An Lạc',N'Huế','2019-12-14','2020-09-24','2019-12-01',N'Chuẩn bị khởi công','DA003')
insert into CongTrinh(TenCT,DiaDiem,NgayKhoiCong,NgayKetThuc,NgayCapPhepXD,TrangThai,MaDA)
values (N'Cầu Cái Tâm', N'Đồng Nai','2017-05-30','2018-03-10','2017-04-25',N'Hoàn Thành','DA003')

insert into CongTrinh(TenCT,DiaDiem,NgayKhoiCong,NgayKetThuc,NgayCapPhepXD,TrangThai,MaDA)
values (N'avxsdsad', N'Đồng Nai','2017-05-30','2018-03-10','2017-04-25',N'Hoàn Thành','DA003')

							-- Insert dữ liệu cho bảng TruongPhongBan --
insert into TruongPhongBan(MaTPB,TenTPB,TaiKhoanTPB)
values ('TPB01','Phan Quang Duy','NVPB1')
insert into TruongPhongBan(MaTPB,TenTPB,TaiKhoanTPB)
values ('TPB02','Hoàng Huỳnh Hoang','NVPB2')
insert into TruongPhongBan(MaTPB,TenTPB,TaiKhoanTPB)
values ('TPB03','Nguyễn Thị Tuyết','NVPB2')
insert into TruongPhongBan(MaTPB,TenTPB,TaiKhoanTPB)
values ('TPB04','Tạ Phước Tiểu Anh','NVPB1')
							-- Insert dữ liệu cho bảng PhongBan --
insert into PhongBan(MaPB,TenPB,MaTPB)
values ('PB01','','TPB04')
insert into PhongBan(MaPB,TenPB,MaTPB)
values ('PB02','','TPB03')
insert into PhongBan(MaPB,TenPB,MaTPB)
values ('PB03','','TPB01')
insert into PhongBan(MaPB,TenPB,MaTPB)
values ('PB04','','TPB02')

							-- Insert dữ liệu cho bảng NhanVien --
insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)
values (N'Nguyễn Quang Đại','1991-10-25','Nam',N'Cần Thơ','PB01')
insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)
values (N'Trần Thị Diệu Hiền','1987-02-10','Nu',N'Hà Nội','PB01')
insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)
values (N'Trần Xuân Nhật Minh','1994-10-14','Nu',N'Thừa Thiên Huế','PB01')
insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)
values (N'Hà Xuân Thăng','1993-12-12','Nam',N'Hồ Chí Minh','PB01')
insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)
values (N'Nguyễn Thái Bảo','1989-03-06','Nam',N'Đồng Nai','PB01')
insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)
values (N'Hoàng Xuân Vinh','1980-07-14','Nam',N'An Giang','PB01')
insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)
values (N'Hồ Thị Minh Thư','1994-09-26','Nu',N'Bình Thuận','PB01')
insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)
values (N'Đinh Văn Hoàng Duy','1987-05-02','Nam',N'Hồ Chí Minh','PB02')
insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)
values (N'Tạ Minh Tâm','1979-02-28','Nam',N'Hòa Bình','PB02')
insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)
values (N'Hà Thị Vinh','1995-03-31','Nu',N'Đà Nẵng','PB02')
insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)
values (N'Ngô Thừa Ân','1992-10-23','Nam',N'Hồ Chí Minh','PB02')
insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)
values (N'Đinh Nguyên Phương','1993-06-21','Nu',N'Quảng Ninh','PB02')
insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)
values (N'Lê Thị Phương','1990-01-01','Nu',N'Quảng Trị','PB02')
insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)
values (N'Lê Hoàng Anh','1992-04-01','Nam',N'Bình Thuận','PB02')
insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)
values (N'Phan Văn Trọng','1980-12-30','Nam',N'Đắk Lắk','PB03')
insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)
values (N'Nguyễn Thị Lan Hương','1995-09-30','Nu',N'Cần Thơ','PB03')
insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)
values (N'Phạm Thị Diệu Anh','1992-03-29','Nu',N'Thừa Thiên Huế','PB03')
insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)
values (N'Đỗ Công Phúc','1985-04-26','Nam',N'Đồng Tháp','PB03')
insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)
values (N'Nguyễn Văn Huy','1990-11-20','Nam',N'Đà Nẵng','PB03')
insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)
values (N'Tạ Phước Hoàng Oanh','1991-12-30','Nu',N'Lâm Đồng','PB03')
insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)
values (N'Hoàng Hải Anh','1986-12-20','Nu',N'Hồ Chí Minh','PB03')
insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)
values (N'Đinh Hoàng Duy','1987-08-27','Nam',N'Hồ Chí Minh','PB03')
insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)
values (N'Lê Đào Duy An','1989-08-09','Nam',N'Hà Nội','PB04')
insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)
values (N'Trần Văn Năm','1978-06-23','Nam',N'Đà Nẵng','PB04')
insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)
values (N'Phan Văn Hậu','1993-09-05','Nam',N'Hồ Chí Minh','PB04')
insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)
values (N'Đào Thị Minh Hà','1991-10-10','Nu',N'Cần Thơ','PB04')
insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)
values (N'Đỗ Công','1992-01-31','Nam',N'Hồ Chí Minh','PB04')
insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)
values (N'Phan Mạnh An','1985-02-19','Nam',N'Đà Nẵng','PB04')
insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)
values (N'Trần Minh Hoàng','1990-05-02','Nam',N'Thừa Thiên Huế','PB04')
insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)
values (N'Lê Thị Thùy Linh','1992-12-22','Nu',N'Hồ Chí Minh','PB04')
insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)
values (N'Lê Thị Thùy ','1992-12-15','Nu',N'Hồ Chí Minh','PB04')

							-- Insert dữ liệu cho bảng CongViec --
--CT1--
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT001','NV0001',N'Tính toán nguyên vật liệu','2018-02-20','2019-05-05')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT001','NV0002',N'Xây Dựng','2018-02-20','2019-05-05')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT001','NV0003',N'Xây Dựng','2018-02-20','2019-05-05')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT001','NV0004',N'Xây Dựng','2018-02-20','2019-05-05')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT001','NV0005',N'Thiết kế','2018-02-20','2019-05-05')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT001','NV0006',N'Kiểm tra công trình','2018-02-20','2019-05-05')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT001','NV0031',N'Xây Dựng','2018-02-20','2019-05-05')
--CT2--
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT002','NV0002',N'Xây Dựng','2018-05-05','2019-05-05')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT002','NV0007',N'Xây Dựng','2018-05-05','2019-05-05')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT002','NV0008',N'Xây Dựng','2018-05-05','2019-05-05')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT002','NV0009',N'Xây Dựng','2018-05-05','2019-05-05')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT002','NV0010',N'Xây Dựng','2018-05-05','2019-05-05')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT002','NV0005',N'Thiết kế','2018-05-05','2019-05-05')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT002','NV0011',N'Tính toán nguyên vật liệu','2018-05-05','2019-05-05')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT002','NV0012',N'Kiểm tra công trình','2018-05-05','2019-05-05')
--CT3--
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT003','NV0003',N'Xây Dựng','2019-02-28','2019-11-20')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT003','NV0013',N'Xây Dựng','2019-02-28','2019-11-20')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT003','NV0014',N'Xây Dựng','2019-02-28','2019-11-20')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT003','NV0015',N'Xây Dựng','2019-02-28','2019-11-20')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT003','NV0016',N'Thiết kế','2019-02-28','2019-11-20')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT003','NV0011',N'Tính toán nguyên vật liệu','2019-02-28','2019-11-20')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT003','NV0017',N'Kiểm tra công trình','2019-02-28','2019-11-20')
--CT4--
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT004','NV0001',N'Tính toán nguyên vật liệu','2019-03-03','2019-12-22')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT004','NV0017',N'Kiểm tra công trình','2019-03-03','2019-12-22')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT004','NV0004',N'Xây Dựng','2019-03-03','2019-12-22')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT004','NV0007',N'Xây Dựng','2019-03-03','2019-12-22')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT004','NV0008',N'Xây Dựng','2019-03-03','2019-12-22')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT003','NV0016',N'Thiết kế','2019-03-03','2019-12-22')
--CT5--
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT005','NV0018',N'Tính toán nguyên vật liệu','2019-01-01','2019-09-30')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT005','NV0012',N'Kiểm tra công trình','2019-01-01','2019-09-30')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT005','NV0013',N'Xây Dựng','2019-01-01','2019-09-30')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT005','NV0014',N'Xây Dựng','2019-01-01','2019-09-30')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT005','NV0015',N'Xây Dựng','2019-01-01','2019-09-30')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT005','NV0019',N'Thiết kế','2019-01-01','2019-09-30')
--CT6--
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT006','NV0018',N'Tính toán nguyên vật liệu','2019-02-25','2019-05-03')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT006','NV0006',N'Kiểm tra công trình','2019-02-25','2019-05-03')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT006','NV0020',N'Xây Dựng','2019-02-25','2019-05-03')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT006','NV0021',N'Xây Dựng','2019-02-25','2019-05-03')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT006','NV0022',N'Xây Dựng','2019-02-25','2019-05-03')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT006','NV0019',N'Thiết kế','2019-02-25','2019-05-03')
--CT7--
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT007','NV0011',N'Tính toán nguyên vật liệu','2018-10-10','2019-10-01')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT007','NV0017',N'Kiểm tra công trình','2018-10-10','2019-10-01')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT007','NV0020',N'Xây Dựng','2018-10-10','2019-10-01')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT007','NV0021',N'Xây Dựng','2018-10-10','2019-10-01')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT007','NV0022',N'Xây Dựng','2018-10-10','2019-10-01')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT007','NV0023',N'Xây Dựng','2018-10-10','2019-10-01')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT007','NV0024',N'Xây Dựng','2018-10-10','2019-10-01')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT007','NV0005',N'Thiết kế','2018-10-10','2019-10-01')
--CT8--
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT008','NV0011',N'Tính toán nguyên vật liệu','2019-12-14','2020-09-24')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT008','NV0027',N'Kiểm tra công trình','2019-12-14','2020-09-24')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT008','NV0023',N'Xây Dựng','2019-12-14','2020-09-24')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT008','NV0024',N'Xây Dựng','2019-12-14','2020-09-24')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT008','NV0025',N'Xây Dựng','2019-12-14','2020-09-24')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT008','NV0026',N'Xây Dựng','2019-12-14','2020-09-24')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT008','NV0028',N'Thiết kế','2019-12-14','2020-09-24')
--CT9--
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT009','NV0030',N'Tính toán nguyên vật liệu','2017-05-30','2018-03-10')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT009','NV0027',N'Kiểm tra công trình','2017-05-30','2018-03-10')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT009','NV0014',N'Xây Dựng','2017-05-30','2018-03-10')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT009','NV0029',N'Xây Dựng','2017-05-30','2018-03-10')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT009','NV0025',N'Xây Dựng','2017-05-30','2018-03-10')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT009','NV0026',N'Xây Dựng','2017-05-30','2018-03-10')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT009','NV0028',N'Thiết kế','2017-05-30','2018-03-10')
insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)
values ('CT009','NV0032',N'Thiết kế','2017-05-30','2018-03-10')

-- view --

create view view_CongTrinh
as
select CongTrinh.MaCT,TenCT,DiaDiem,NgayKhoiCong,NgayKetThuc,NgayCapPhepXD,TrangThai,MaDA,SoLuongnv = count(MaNV),Soluongcv=count(distinct TenCV)
from CongTrinh join CongViec on CongTrinh.MaCT = CongViec.MaCT
group by CongTrinh.MaCT,TenCT,DiaDiem,NgayKhoiCong,NgayKetThuc,NgayCapPhepXD,TrangThai,MaDA
go

create view view_NhanVien
as
select n.MaNV,TenNV,NgaySinh,GioiTinh,DiaChi,Ngaycong= count(c.MaNV),MaPB
from NhanVien n join ChamCong c on c.MaNV= n.MaNV
group by n.MaNV,TenNV,NgaySinh,GioiTinh,DiaChi,MaPB
go

create view view_CongViec
as
select n.MaCT,n.TenCV,n.Ngaybatdau,n.NgayDung,c.MaNV,TenNV
from CongViec n join NhanVien c on n.MaNV= c.MaNV
group by  n.MaCT,n.TenCV,n.Ngaybatdau,n.NgayDung,c.MaNV,TenNV
go

create function func_NV(@maCT varchar(10),@ngaycham Datetime)
returns table
as 
return
	select n.MaNV, TenNV
	from NhanVien n join CongViec c on n.MaNV = c.MaNV
	where c.MaCT = @maCT and (@ngaycham between c.Ngaybatdau and c.NgayDung)  and	not exists (select MaNV
																							from ChamCong
																			where  MaCT=@maCT and NgayChamCong = @ngayCham and n.MaNV = MaNV)

go


select * from ChamCong order by MaNV


---------------------Thong ke ---------------------------
create view view_TKCT
as 
select d.MaDA,d.TenDA,n.TenNVQLDA,CountCT=count(distinct c.MaCT),CountNV=count(distinct v.MaNV)
from DuAn d join CongTrinh c on d.MaDA=c.MaDA
			join NhanVienQLDA n on n.MaNVQLDA=d.MaNVQLDA  
			join CongViec v on v.MaCT = c.MaCT
group by n.TenNVQLDA,d.MaDA,d.TenDA
go

create function func_TKCV(@maCT varchar(10))
returns table
as
return
	select TenCV,count(MaNV) as countNV
	from CongViec 
	where MaCT= @maCT
	group by TenCV
go

create function func_TKCV(@maCT varchar(10))
returns table
as
return
	select TenCV,count(MaNV) as countNV
	from CongViec 
	where MaCT= @maCT
	group by TenCV
go

create view view_TongTKNV
as
	select n.MaNV,n.TenNV,countNC=count(cc.NgayChamCong)
	from NhanVien n join ChamCong cc on cc.MaNV=n.MaNV
	group by n.MaNV,n.TenNV
go
create function func_TKNV(@mact varchar(10))
returns table
as
return
	select v.MaNV,TenNV,countNC,countNCCT=count(cc.NgayChamCong)
	from view_TongTKNV v join ChamCong cc on v.MaNV=cc.MaNV
	where MaCT=@mact
	group by v.MaNV,TenNV,countNC
go
 drop table PhongBan