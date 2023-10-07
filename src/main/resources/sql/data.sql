USE [master]

CREATE DATABASE [SAVIS_NHOM5]
GO

USE [SAVIS_NHOM5]
GO

CREATE TABLE HangKhachHang(
                              MaHang			BIGINT
                                  IDENTITY(1,1) PRIMARY KEY,
                              TenHang			NVARCHAR(50),
                              MoTa			NVARCHAR(MAX),
                              DiemToiThieu	INT NOT NULL,
                              TrangThai		INT
)
GO

CREATE TABLE KhachHang(
                          MaKhachHang		BIGINT
                              IDENTITY(1,1) PRIMARY KEY,
                          TenKhachHang	NVARCHAR(50),
                          SinhNhat		DATE,
                          DiaChi			NVARCHAR(MAX),
                          SoDienThoai		VARCHAR(15) ,
                          Email			VARCHAR(50) ,
                          GioiTinh		BIT,
                          ChungMinhThu	VARCHAR(15)	,
                          SoCanCuoc		VARCHAR(15)	,
                          AnhDaiDien		VARCHAR(50), -- Link anh
                          TrangThai		INT,
                          DiemTichLuy		INT DEFAULT 0, --Mac dinh 0

                          HangKhachHang	BIGINT
                              REFERENCES HangKhachHang(MaHang)
)
GO

CREATE TABLE TheThanhVien(
                             MaThe			VARCHAR(50) PRIMARY KEY,
                             MauThe			NVARCHAR(10),
                             LoaiThe			NVARCHAR(10),
                             NgayPhatHanh	DATE,
                             NgayHuy			DATE,
                             TrangThai		INT,

                             NguoiSoHuu		BIGINT
                                 REFERENCES KhachHang(MaKhachHang)
)
GO

CREATE TABLE PhieuGiamGia(
                             MaPhieu			VARCHAR(10) PRIMARY KEY,
                             TenPhieu		NVARCHAR(20),
                             NgayBatDau		DATE,
                             NgayKetThuc		DATE,
                             GiaTriGiam		MONEY,
                             GiaTriGiamToiDa	MONEY,
                             HinhThucGiam	BIT, -- % hay gia tien
                             TrangThai		INT,

                             NguoiSoHuu		BIGINT
                                 REFERENCES KhachHang(MaKhachHang)
)
GO

CREATE TABLE DiaChi (
                        MaDiaChi		UNIQUEIDENTIFIER
                            DEFAULT NEWID() PRIMARY KEY,
                        TenDiaChi		NVARCHAR(50),
                        MoTaChiTiet		NVARCHAR(MAX),
                        TinhThanhPho	NVARCHAR(50),
                        QuanHuyen		NVARCHAR(50),
                        PhuongXa		NVARCHAR(50),
                        DuongPho		NVARCHAR(50),

                        KhachHang		BIGINT
                            REFERENCES KhachHang(MaKhachHang),
)
GO

CREATE TABLE SanPham(
                        MaSanPham	BIGINT
                            IDENTITY(1,1) PRIMARY KEY,
                        TenSanPham	NVARCHAR(100),
                        ChatLieu	NVARCHAR(100),
                        GiaHienHanh	MONEY,
                        SoLuongTon	INT,
                        MoTa		NVARCHAR(MAX),
                        TrangThai	INT,
                        ma_loaiDe		BIGINT
                            REFERENCES LoaiDe(MaLoaiDe),
                        ma_mauSac		BIGINT
                            REFERENCES MauSac(MauMauSac),
                        ma_nhaSanXuat		BIGINT
                            REFERENCES NhaSanXuat(MaNSX),
                        ma_loaiSanPham		BIGINT
                            REFERENCES LoaiSp(MaLoaiSp)
)
GO
CREATE TABLE LoaiSp(
                       MaLoaiSp			BIGINT
                           IDENTITY(1,1) PRIMARY KEY,
                       Ten			NVARCHAR(50),
                       MoTa		NVARCHAR(50)
)
GO
CREATE TABLE LoaiDe(
                       MaLoaiDe			BIGINT
                           IDENTITY(1,1) PRIMARY KEY,
                       Ten			NVARCHAR(50),
                       MoTa		NVARCHAR(50)
)
GO
CREATE TABLE MauSac(
                       MauMauSac			BIGINT
                           IDENTITY(1,1) PRIMARY KEY,
                       Ten		NVARCHAR(50)
)
GO
CREATE TABLE NhaSanXuat(
                           MaNSX			BIGINT
                               IDENTITY(1,1) PRIMARY KEY,
                           Ten			NVARCHAR(50),
                           TrangThai		INT
)
GO

CREATE TABLE HoaDon(
                       MaHoaDon		BIGINT
                           IDENTITY(1,1) PRIMARY KEY,
                       NgayLap			DATE,
                       NgaySua			DATE,
                       NguoiLap		NVARCHAR(50),
                       NguoiSua		NVARCHAR(50),
                       GhiChu			NVARCHAR(MAX),
                       NgayThanhToan	DATE,
                       TrangThai		INT,

                       NguoiMua		BIGINT
                           REFERENCES KhachHang(MaKhachHang),
)
GO

CREATE TABLE HoaDonChiTiet(
                              MaHoaDonChiTiet	BIGINT
                                  IDENTITY(1,1) PRIMARY KEY,
                              MaHoaDon	BIGINT
                                  REFERENCES HoaDon(MaHoaDon),
                              MaSanPham	BIGINT
                                  REFERENCES SanPham(MaSanPham),
                              SoLuong		INT,
                              DonGia		MONEY,

                              GhiChu		NVARCHAR(MAX),
                              TrangThai	INT
)
GO

CREATE TABLE PhieuGiaoHang(
                              MaPhieuGiao	UNIQUEIDENTIFIER
                                  DEFAULT NEWID() PRIMARY KEY,

                              NguoiNhan	NVARCHAR(50),
                              SdtNhan		VARCHAR(20),

                              NguoiGiao	NVARCHAR(50),
                              SdtGiao		VARCHAR(20),
                              NgayGiao	DATE,
                              NgayNhan	DATE,

                              NguoiTao	NVARCHAR(50),
                              PhiGiaoHang	MONEY,

                              HoaDonGiao	BIGINT
                                  REFERENCES HoaDon(MaHoaDon),
                              DiaChiGiao	UNIQUEIDENTIFIER
                                  REFERENCES DiaChi(MaDiaChi),

                              GhiChu		NVARCHAR(MAX),
                              TrangThai	INT,
)

CREATE TABLE GioHang(
                        MaGioHang	UNIQUEIDENTIFIER
                            DEFAULT NEWID() PRIMARY KEY,
                        NgayTao		DATE,
                        NgayCapNhap	DATE,

                        NguoiSoHuu	BIGINT
                            REFERENCES KhachHang(MaKhachHang),

                        GhiChu		NVARCHAR(MAX),
                        TrangThai	INT,
)
GO

CREATE TABLE GioHangChiTiet(
                               MaGioHangChiTiet	UNIQUEIDENTIFIER
                                   DEFAULT NEWID() PRIMARY KEY,
                               MaGioHang	UNIQUEIDENTIFIER
                                   REFERENCES GioHang(MaGioHang),
                               MaSanPham	BIGINT
                                   REFERENCES SanPham(MaSanPham),

                               SoLuong		INT,

                               GhiChu		NVARCHAR(MAX),
                               TrangThai	INT
)
GO

CREATE TABLE DanhSachYeuThich(
                                 MaDanhSach	UNIQUEIDENTIFIER
                                     DEFAULT NEWID() PRIMARY KEY,
                                 NgayTao		DATE,
                                 NgayCapNhap	DATE,

                                 NguoiSoHuu	BIGINT
                                     REFERENCES KhachHang(MaKhachHang),

                                 GhiChu		NVARCHAR(MAX),
                                 TrangThai	INT,
)
GO

CREATE TABLE YeuThichChiTiet(
                                MaYeuThichChiTiet	UNIQUEIDENTIFIER
                                    DEFAULT NEWID() PRIMARY KEY,
                                MaDanhSach	UNIQUEIDENTIFIER
                                    REFERENCES DanhSachYeuThich(MaDanhSach),
                                MaSanPham	BIGINT
                                    REFERENCES SanPham(MaSanPham),

                                GhiChu		NVARCHAR(MAX),
                                TrangThai	INT
)