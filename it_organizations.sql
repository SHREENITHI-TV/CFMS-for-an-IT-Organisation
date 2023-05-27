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
-- Table structure for table `it_organizations`
--

CREATE TABLE `it_organizations` (
  `ID` int(11) NOT NULL,
  `Company_Name` varchar(255) NOT NULL,
  `Headquarters` varchar(255) NOT NULL,
  `Year_Founded` int(11) NOT NULL,
  `Industry` varchar(255) NOT NULL,
  `Services_Products` text NOT NULL,
  `No_Employees` int(11) NOT NULL,
  `Revenue` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `it_organizations`
--

INSERT INTO `it_organizations` (`ID`, `Company_Name`, `Headquarters`, `Year_Founded`, `Industry`, `Services_Products`, `No_Employees`, `Revenue`) VALUES
(5, 'Tech Mahindra Limited', 'Pune, Maharashtra', 1986, 'IT Services', 'Consulting, IT Services, Digital Transformation, Cloud', 137412, 'INR 38874 crore'),
(6, 'Cognizant Technology Solutions Corporation', 'Teaneck, New Jersey (USA)', 1994, 'IT Services', 'Consulting, IT Services, Digital Transformation, Cloud', 300000, 'USD 16.7 billion'),
(7, 'Accenture India', 'Mumbai, Maharashtra', 1989, 'IT Services', 'Consulting, IT Services, Digital Transformation, Cloud', 200000, 'USD 47.1 billion'),
(8, 'IBM India', 'Bangalore, Karnataka', 1992, 'IT Services', 'Consulting, IT Services, Digital Transformation, Cloud', 350000, 'USD 73.6 billion'),
(9, 'Armonk, New York, USA', '1911', 0, 'IT consulting, software development, and more', '380,000', 74, 'https://www.ibm.com/'),
(10, 'Amazzon', '2009', 2009, 'Digital services for governance and public service delivery', '2,000', 0, 'https://www.csc.gov.in/'),
(11, 'Capgemini Technology Services India Limited', 'Paris, France', 1967, 'IT Services', 'IT consulting, software development, and more', 270, '18.3 billion USD'),
(12, 'Capgemini Technology Services India Limited', 'Paris, France', 1967, 'IT Services', 'IT consulting, software development, and more', 270, '18.3 billion USD'),
(13, 'abcd', 'chennai', 2934, 'IT Services', 'it sector', 5263, 'inr 3234 crores'),
(17, 'star', 'delhi', 1879, 'IT Services', 'developer tools', 1943, 'usd 4.5 billion'),
(18, 'UML', 'mumbai', 1879, 'it services', 'Software developer tools', 4567, 'inr 45 crores'),
(20, 'viss', 'usa', 2020, 'it services', 'developer tools', 250, 'usd 1.5 millio');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `it_organizations`
--
ALTER TABLE `it_organizations`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `Company_Name_idx` (`Company_Name`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `it_organizations`
--
ALTER TABLE `it_organizations`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
