# 🧪 Magento User Stories - Test Automation Project

This project is a **test automation suite** based on structured **user stories** for the [Magento Demo Website](https://magento.softwaretestingboard.com/). 
It verifies core e-commerce functionality, including user registration, login, cart operations, product ordering, and more.


## 🔍 Covered User Stories

| US ID | Feature Description                   |
|-------|----------------------------------------|
| US701 | User Registration                     |
| US702 | User Login                            |
| US703 | Address Management                    |
| US704 | Top Navigation Menu Validation        |
| US705 | Add/Remove Items to/from Cart         |
| US706 | Product Checkout & Payment Process    |
| US707 | Product Search by SKU                 |
| US708 | Wishlist Management                   |

### ✅ US701 – User Registration
> As a new user, I want to register on the Magento platform so that I can gain access to the site.

- Fill in first name, last name, email, password, and confirm password fields.
- Password strength indicator should be visible.
- Submit the form using "Create an Account" button.
- Option to return to login page using "Back" button.

---

### ✅ US702 – User Login
> As a registered user, I want to log in using my credentials so I can access my account and services.

- Enter email and password into the login form.
- Submit with "Sign In" button.
- "Forgot Your Password?" should redirect to reset password.
- Proper error handling for invalid or missing credentials.

---

### ✅ US703 – Address Management
> As a logged-in user, I want to manage multiple addresses to use for billing and shipping.

- Add new address with all required fields (name, street, city, ZIP, country, etc.).
- Edit or delete saved addresses.
- Mark addresses as default for billing or shipping.
- Must be logged in to access this feature.

---

### ✅ US704 – Top Navigation Menu (TAB Menu)
> As a user, I want to use the top navigation menu to explore product categories and subcategories.

- Main categories: "What's New", "Women", "Men", "Gear", "Training", "Sale".
- Clicking a main category should show subcategories (e.g., Women > Tops > Jackets).
- All links should be functional and lead to the correct pages.

---

### ✅ US705 – Add/Remove Items from Cart
> As a logged-in user, I want to add or remove products from my shopping cart.

- Browse and select any product to add to cart.
- Change quantity of cart items.
- Remove specific items from the cart.
- Cart should update and display correct contents.

---

### ✅ US706 – Product Checkout
> As a registered user, I want to complete an order by entering shipping and payment information.

- Add at least one item to the cart.
- Proceed to checkout with shipping and billing address.
- Select a shipping method.
- Confirm payment and place the order.
- See confirmation and order number upon success.

---

### ✅ US707 – Product Search (by SKU)
> As a user, I want to search for a product by its SKU to ensure I’m viewing the correct item.

- Enter a valid SKU into the search bar (e.g., `MJ08`).
- See matching product results and verify SKU on product detail page.
- Invalid SKUs should show a “no results” message.

---

### ✅ US708 – Wishlist Functionality
> As a user, I want to add products to a wishlist so I can save them for later.

- Add products to wishlist from product detail pages.
- View wishlist under "My Account" > "My Wish List".
- Remove products from wishlist.
- See updated wishlist after modifications.

---

## 🛠️ Technologies & Tools

- Java + Selenium WebDriver
- Cucumber (BDD)
- Maven (Project & Dependency Management)
- Git + GitHub (Version Control)
- Jira  (Test Management)
- ExtentReports (Custom Reporting)
- Page Object Model (POM Design Pattern)

## 📁 Project Structure
├── src
│ ├── test
│ │ ├── java
│ │ │ ├── stepDefinitions
│ │ │ ├── pageObjects
│ │ │ └── runners
│ │ │ └── pages
│ │ │ └── featureFiles
│ │ │ └──utilities
│ │ │ └──hooks
│ │ ├── resources
│ │ │ ├── extent.properties
├── configuration.properties
├── pom.xml
└── README.md
