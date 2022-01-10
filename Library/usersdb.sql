-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 27, 2019 at 09:57 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `usersdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `name` varchar(50) NOT NULL,
  `price` varchar(20) NOT NULL,
  `type` varchar(20) NOT NULL,
  `description` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`name`, `price`, `type`, `description`) VALUES
('Supplement Ultra', '1000', 'Premium', 'Particularly Used For Body Building'),
('Supplement Plus', '500', 'Regular', 'Particularly Used For Body Building');

-- --------------------------------------------------------

--
-- Table structure for table `userslist`
--

CREATE TABLE `userslist` (
  `name` varchar(100) NOT NULL,
  `dob` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `phonenumber` varchar(20) NOT NULL,
  `password` varchar(50) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `membershiptype` varchar(10) NOT NULL,
  `usertype` varchar(5) NOT NULL,
  `balance` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userslist`
--

INSERT INTO `userslist` (`name`, `dob`, `email`, `phonenumber`, `password`, `gender`, `membershiptype`, `usertype`, `balance`) VALUES
('Ifty', '1/24/99', 'ifty@gmail.com', '01625100957', 'ifty', 'Male', 'Regular', '1', '500.0'),
('Bristy', '5/26/98', 'bristy@gmail.com', '0171111111', 'bristy', 'Female', 'Regular', '1', '0'),
('Oasif', '2/26/98', 'oasif@gmail.com', '018111111', 'oasif', 'Male', 'Regular', '1', '0'),
('Owner', '12/16/71', 'admin@gmail.com', '0000000000', 'admin', 'Male', 'Owner', '0', '0'),
('Rahim', '2/2/81', 'rahim@gmail.com', '55555555', 'rahim', 'Male', 'Employee', '2', '0'),
('Karima', '3/3/85', 'karima@gmail.com', '88888888', 'karima', 'Female', 'Employee', '2', '0');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
