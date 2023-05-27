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
-- Table structure for table `it_organization_reviews`
--

CREATE TABLE `it_organization_reviews` (
  `ID` int(11) NOT NULL,
  `Company_Name` varchar(255) NOT NULL,
  `Reviewer_Name` varchar(255) NOT NULL,
  `Review_Date` date NOT NULL,
  `Review_Rating` int(11) NOT NULL,
  `Review_Comment` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `it_organization_reviews`
--

INSERT INTO `it_organization_reviews` (`ID`, `Company_Name`, `Reviewer_Name`, `Review_Date`, `Review_Rating`, `Review_Comment`) VALUES
(32, 'Tata Consultancy Services', 'Jane Doe', '2022-02-02', 5, 'Excellent services.'),
(33, 'Infosys Limited', 'Bob Johnson', '2022-03-01', 3, 'Average services.'),
(34, 'Infosys Limited', 'Alice Brown', '2022-03-15', 2, 'Poor communication and support.'),
(35, 'Wipro Limited', 'David Lee', '2022-04-10', 4, 'Good experience overall.'),
(36, 'Wipro Limited', 'Sarah Davis', '2022-04-20', 3, 'Could improve customer service.'),
(39, 'Tech Mahindra Limited', 'Kevin Wilson', '2022-06-01', 2, 'Disappointing experience.'),
(40, 'Tech Mahindra Limited', 'Linda Taylor', '2022-06-15', 3, 'Decent services, but nothing exceptional.'),
(41, 'Accenture India', 'abcd', '2023-03-15', 3, 'Good services and products'),
(42, 'abcd', 'Watson', '2023-03-20', 4, 'Average Services'),
(43, 'star', 'abcd', '2023-03-20', 2, 'poor communication'),
(44, 'amazzon', 'raja', '2023-03-20', 4, 'Good performance');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `it_organization_reviews`
--
ALTER TABLE `it_organization_reviews`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `Company_Name` (`Company_Name`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `it_organization_reviews`
--
ALTER TABLE `it_organization_reviews`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=45;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `it_organization_reviews`
--
ALTER TABLE `it_organization_reviews`
  ADD CONSTRAINT `it_organization_reviews_ibfk_1` FOREIGN KEY (`Company_Name`) REFERENCES `it_organizations` (`Company_Name`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
