-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 20, 2023 at 04:30 PM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `customer_feedback`
--

-- --------------------------------------------------------

--
-- Table structure for table `deleted_reviews`
--

CREATE TABLE `deleted_reviews` (
  `ID` int(11) NOT NULL,
  `Company_Name` varchar(255) NOT NULL,
  `Reviewer_Name` varchar(255) NOT NULL,
  `Reason_To_Delete` text NOT NULL,
  `Deletion_Date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `deleted_reviews`
--

INSERT INTO `deleted_reviews` (`ID`, `Company_Name`, `Reviewer_Name`, `Reason_To_Delete`, `Deletion_Date`) VALUES
(1, 'Infosys Limited', 'Bob Johnson', 'Poor comment', '2023-03-20'),
(5, 'Infosys Limited', 'John Doe', 'Duplicate review', '2022-01-20'),
(6, 'Wipro Limited', 'Jane Smith', 'Inappropriate language', '2022-02-12'),
(7, 'Tata Consultancy Services', 'Bob Johnson', 'Off-topic review', '2022-03-05'),
(8, 'Hcl technologies limited', 'Michael white', 'duplicate entry', '2023-03-20');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `deleted_reviews`
--
ALTER TABLE `deleted_reviews`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `Company_Name` (`Company_Name`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `deleted_reviews`
--
ALTER TABLE `deleted_reviews`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `deleted_reviews`
--
ALTER TABLE `deleted_reviews`
  ADD CONSTRAINT `deleted_reviews_ibfk_1` FOREIGN KEY (`Company_Name`) REFERENCES `it_organizations` (`Company_Name`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
