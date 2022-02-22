﻿CREATE DATABASE EduSys
GO
USE EduSys
GO
CREATE TABLE NHANVIEN
(
	MANV NVARCHAR(50) NOT NULL PRIMARY KEY,
	MATKHAU NVARCHAR(50) NOT NULL,
	HoTen NVARCHAR(50) NOT NULL,
	VaiTro BIT NOT NULL,
	Email varchar(255) NOT NULL,
	TrangThai BIT
)
GO
CREATE TABLE CHUYENDE
(
	MaCD NCHAR(5) NOT NULL PRIMARY KEY,
	TenCD NVARCHAR(50) NOT NULL,
	HocPhi FLOAT NOT NULL,
	ThoiLuong INT NOT NULL,
	Hinh NVARCHAR(50) NOT NULL,
	MoTa NVARCHAR(300) NOT NULL
)
GO
CREATE TABLE KHOAHOC
(
	MaKH INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
	MaCD NCHAR(5) NOT NULL FOREIGN KEY REFERENCES CHUYENDE(MaCD) ON DELETE NO ACTION ON UPDATE CASCADE,
	HocPhi FLOAT NOT NULL,
	ThoiLuong INT NOT NULL,
	NgayKG DATE NOT NULL,
	GhiChu NVARCHAR(50),
	MaNV NVARCHAR(50) NOT NULL FOREIGN KEY REFERENCES NHANVIEN(MANV) ON DELETE NO ACTION ON UPDATE CASCADE,
	NgayTao DATE NOT NULL
)
GO
CREATE TABLE NGUOIHOC
(
	MaNH NCHAR(7) NOT NULL PRIMARY KEY,
	HoTen NVARCHAR(50) NOT NULL,
	NgaySinh DATE NOT NULL,
	GioiTinh BIT NOT NULL,
	DienThoai NVARCHAR(50) NOT NULL,
	Email NVARCHAR(50) NOT NULL,
	GhiChu NVARCHAR(MAX) NULL,
	MaNV NVARCHAR(50) NOT NULL FOREIGN KEY REFERENCES NHANVIEN(MANV) ON DELETE NO ACTION ON UPDATE CASCADE,
	NgayDK DATE NOT NULL
)
GO
CREATE TABLE HOCVIEN
(
	 MaHV INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
	 MaKH INT NOT NULL FOREIGN KEY REFERENCES KHOAHOC(MaKH) ON DELETE NO ACTION ON UPDATE CASCADE,
	 MaNH NCHAR(7) NOT NULL FOREIGN KEY REFERENCES NGUOIHOC(MaNH) ON DELETE CASCADE ON UPDATE NO ACTION,
	 Diem FLOAT NOT NULL
)
--tạo thủ tục lưu bảng điểm
GO
CREATE PROC [dbo].[sp_BangDiem](@MaKH INT)
AS BEGIN
	SELECT
		nh.MaNH,
		nh.HoTen,
		hv.Diem
	FROM HOCVIEN hv
		JOIN NGUOIHOC nh ON nh.MaNH=hv.MaNH
	WHERE hv.MaKH = @MaKH
	ORDER BY hv.Diem DESC
END
GO
--tạo thủ tục lưu thống kê điểm
CREATE PROC [dbo].[sp_ThongKeDiem]
AS BEGIN
	SELECT
		TenCD ChuyenDe,
		COUNT(MaHV) SoHV,
		MIN(Diem) ThapNhat,
		MAX(Diem) CaoNhat,
		AVG(Diem) TrungBinh
	FROM KhoaHoc kh
		JOIN HocVien hv ON kh.MaKH=hv.MaKH
		JOIN ChuyenDe cd ON cd.MaCD=kh.MaCD
	GROUP BY TenCD
END
GO
--tạo thủ tục lưu thống kê điểm
CREATE PROC [dbo].[sp_ThongKeDoanhThu](@Year INT)
AS BEGIN
	SELECT
		TenCD ChuyenDe,
		COUNT(DISTINCT kh.MaKH) SoKH,
		COUNT(hv.MaHV) SoHV,
		SUM(kh.HocPhi) DoanhThu,
		MIN(kh.HocPhi) ThapNhat,
		MAX(kh.HocPhi) CaoNhat,
		AVG(kh.HocPhi) TrungBinh
	FROM KHOAHOC kh
		JOIN HOCVIEN hv ON kh.MaKH=hv.MaKH
		JOIN CHUYENDE cd ON cd.MaCD=kh.MaCD
	WHERE YEAR(NgayKG) = @Year
	GROUP BY TenCD
END
GO
--tạo thủ tục lưu thống kê người học
CREATE PROC [dbo].[sp_ThongKeNguoiHoc]
AS BEGIN
	SELECT
		YEAR(NgayDK) Nam,
		COUNT(*) SoLuong,
		MIN(NgayDK) DauTien,
		MAX(NgayDK) CuoiCung
	FROM NGUOIHOC
	GROUP BY YEAR(NgayDK)
END
GO

SELECT * FROM NhanVien
SELECT * FROM HOCVIEN

--Nhân viên
INSERT INTO NHANVIEN (MANV, MATKHAU, HoTen, Email, VaiTro, TrangThai) VALUES (?,?,?,?,?,?)
UPDATE NHANVIEN SET MATKHAU =?, HoTen =?, VaiTro =?, Email =?, TrangThai =? WHERE  MANV = ?
DELETE FROM NHANVIEN WHERE  MANV = ?
SELECT * FROM NhanVien
SELECT * FROM NhanVien WHERE  MANV = ? and MATKHAU = ?

--Chuyên đề
INSERT INTO CHUYENDE(MaCD, TenCD, HocPhi, ThoiLuong, Hinh, MoTa) VALUES (?,?,?,?,?,?)
UPDATE CHUYENDE SET TenCD = ?, HocPhi = ?, ThoiLuong = ?, Hinh = ?, MoTa =? WHERE  MaCD = ?
DELETE FROM CHUYENDE WHERE  MaCD = ?
SELECT * FROM CHUYENDE WHERE  MaCD = ?

--Người học
SELECT * FROM NGUOIHOC
INSERT INTO NGUOIHOC (MaNH, HoTen, NgaySinh, GioiTinh, DienThoai, Email, GhiChu, MaNV, NgayDK) VALUES (?,?,?,?,?,?,?,?,?)
UPDATE NGUOIHOC SET HoTen = ?, NgaySinh = ?, GioiTinh = ?, DienThoai = ?, Email = ?, GhiChu =, MaNV = ?, NgayDK = ? WHERE MaNH = ?
DELETE FROM NGUOIHOC WHERE MaNH = ?

SELECT * FROM NGUOIHOC WHERE  HoTen like ?

--Khóa học
SELECT * FROM KHOAHOC WHERE MaCD = ?
INSERT INTO KHOAHOC (MaKH, MaCD, HocPhi, ThoiLuong, NgayKG, GhiChu, MaNV, NgayTao) VALUES (?,?,?,?,?,?,?,?)
UPDATE KHOAHOC SET MaCD = ?, HocPhi = ?, ThoiLuong = ?, NgayKG = ?, GhiChu = ?, MaNV = ?, NgayTao = ? WHERE MaKH = ?
DELETE FROM KHOAHOC WHERE MaKH = ?

INSERT INTO KHOAHOC (MaCD, HocPhi, ThoiLuong, NgayKG, GhiChu, MaNV, NgayTao) VALUES
('01',300000,48,'2022/03/03',N'Test','vontph','2022/02/21')
INSERT INTO KHOAHOC (MaCD, HocPhi, ThoiLuong, NgayKG, GhiChu, MaNV, NgayTao) VALUES
('01',300000,48,'03/03/2022',N'Test','vontph','21/02/2022')
SET IDENTITY_INSERT [dbo].[HocVien] off
SET IDENTITY_INSERT [dbo].[KhoaHoc] off 
SET IDENTITY_INSERT [dbo].[NguoiHoc] off 
-- Bảng Học viên
DELETE FROM HOCVIEN WHERE (MaHV = ?)
UPDATE HOCVIEN SET Diem = 2 WHERE MaHV = 5
INSERT INTO HOCVIEN (MaKH, MaNH, Diem) VALUES (4, 'PS01638', 1)
INSERT INTO HOCVIEN (MaKH, MaNH, Diem) VALUES (13, 'PH186', 9)
select * from KHOAHOC
select * from NGUOIHOC
select * from HOCVIEN
select * from CHUYENDE
select * from NHANVIEN

SELECT DISTINCT year(NgayKG) as [Year] FROM KhoaHoc ORDER BY [Year] DESC