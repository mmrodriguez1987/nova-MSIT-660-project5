
# StringUtils - Unit Test Documentation

This project provides a suite of **JUnit 5** tests for the `StringUtils` Java class. The class implements various string utility operations including constructor validation, case conversion, string concatenation, and more.

## 📁 Files Included

- `StringUtils.java` — The class under test.
- `StringUtilsTest.java` — JUnit test class.
- `README.md` — This documentation.

---

## ✅ Unit Tests Overview

This test suite consists of **eight test cases**, each corresponding to specific expected behaviors or error handling scenarios within the `StringUtils` class.

---

### 1.2.1 Test Case 01
- **Method Tested:** `StringUtils(String)`
- **Description:** Constructor should store a valid, non-empty string.
- **Input:** `"abc"`
- **Expected Result:** `getMyStr()` returns `"abc"`.
- **Status:** ✅ Passed

---

### 1.2.2 Test Case 02
- **Method Tested:** `StringUtils(String)`
- **Description:** Constructor should reject `null` input.
- **Input:** `new StringUtils(null)`
- **Expected Result:** Throws `NullPointerException`.
- **Actual:** ❌ Fails – throws `InvalidParameterException`.

---

### 1.2.3 Test Case 03
- **Method Tested:** `StringUtils(String)`
- **Description:** Constructor should reject an empty string.
- **Input:** `new StringUtils("")`
- **Expected Result:** Throws `NullPointerException`.
- **Actual:** ❌ Fails – throws `InvalidParameterException`.

---

### 1.2.4 Test Case 04
- **Method Tested:** `StringUtils(String, boolean)`
- **Description:** If `upper=true`, stores text in uppercase.
- **Input:** `"abc", true`
- **Expected Result:** `getMyStr()` returns `"ABC"`.
- **Status:** ✅ Passed

---

### 1.2.5 Test Case 05
- **Method Tested:** `StringUtils(String, boolean)`
- **Description:** If `upper=false`, stores text in lowercase.
- **Input:** `"ABC", false`
- **Expected Result:** `getMyStr()` returns `"abc"`.
- **Status:** ✅ Passed

---

### 1.2.6 Test Case 06
- **Method Tested:** `StringUtils(String, boolean)`
- **Description:** Empty string input should be rejected.
- **Input:** `new StringUtils("", true)`
- **Expected Result:** Throws `NullPointerException`.
- **Actual:** ❌ Fails – no exception thrown

---

### 1.2.7 Test Case 07
- **Method Tested:** `convertToUpperCase()`
- **Description:** Method should convert the full string to uppercase.
- **Input:** `"abc"`
- **Expected Result:** Returns `"ABC"`.
- **Actual:** ❌ Fails – returns `"BC"` (first character is skipped)

---

### 1.2.8 Test Case 08
- **Method Tested:** `updateToConcat(String)`
- **Description:** Should concatenate and update internal string value.
- **Input:** `"hi"`, then `updateToConcat("there")`
- **Expected Result:** Returns `"hithere"`; `getMyStr()` also returns `"hithere"`.
- **Status:** ✅ Passed

---

## 🐞 Identified Defects

### Defect 1 – `convertToUpperCase`
- **Problem:** Loop skips first character (`i = 1`).
- **Fix Suggestion:** Change loop to start from `i = 0`.

### Defect 2 – `StringUtils(String, boolean)`
- **Problem:** Accepts empty string without throwing exception.
- **Fix Suggestion:** Add validation for empty string.

### Defect 3 – `StringUtils(String)`
- **Problem:** Throws `InvalidParameterException` instead of documented `NullPointerException`.
- **Fix Suggestion:** Change thrown exception type to `NullPointerException`.

---

## 🧪 Framework

- **JUnit Version:** 5
- **Test Strategy:** Each method is tested for both success and failure conditions, including:
  - Exception throwing
  - Case handling
  - Data correctness

---

## 📌 Notes

Please make sure the `StringUtils` class is updated according to the identified defects in order to pass all tests.

