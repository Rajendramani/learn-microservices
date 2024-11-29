CREATE TABLE IF NOT EXISTS `customer` (
    `customer_id` INT AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(100) NOT NULL,
    `email` VARCHAR(100) NOT NULL,
    `mobile_number` VARCHAR(100) NOT NULL,
    `created_at` DATE,
    `created_by` VARCHAR(20),
    `updated_at` DATE,
    `updated_by` VARCHAR(20)
);
CREATE TABLE IF NOT EXISTS `accounts` (
    `customer_id` INT NOT NULL,
    `account_number` INT AUTO_INCREMENT PRIMARY KEY,
    `account_type` VARCHAR(100) NOT NULL,
    `branch_address` VARCHAR(200) NOT NULL,
    `created_at` DATE,
    `created_by` VARCHAR(20),
    `updated_at` DATE,
    `updated_by` VARCHAR(20)
);
