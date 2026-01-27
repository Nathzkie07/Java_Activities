# Activity 9: Exception Handling & Logging Best Practices

## 🚀 Step 1: Clone and Setup Your Repository

### **Clone this project:**
```bash
git clone <repository-url>
cd m4-activity-9
```

### **Change origin to your own repository:**
```bash
# Remove the original remote
git remote remove origin

# Add your own repository as origin
git remote add origin <your-repository-url>

# Create and switch to M4_ACTIVITY9 branch
git switch -c M4_ACTIVITY9

# Push to your repository
git push -u origin M4_ACTIVITY9
```

---

## 🎯 Step 2: Learning Objectives

By completing this activity, you will learn to:

### **Exception Handling Best Practices:**
- ✅ Catch specific exceptions instead of generic `Exception`
- ✅ Never swallow exceptions (no empty catch blocks)
- ✅ Preserve original exceptions using exception chaining
- ✅ Provide meaningful error messages with context
- ✅ Avoid using exceptions for control flow
- ✅ Understand when to log vs when to throw

### **Logging Best Practices:**
- ✅ Configure Logback with Console and Daily Rolling File appenders
- ✅ Use appropriate log levels (ERROR, WARN, INFO, DEBUG)
- ✅ Implement parameterized logging for performance and security
- ✅ Log exception objects to capture stack traces
- ✅ Avoid logging sensitive information
- ✅ Use one logger per class

### **Professional Development Practices:**
- ✅ Write production-ready error handling code
- ✅ Create maintainable and debuggable applications
- ✅ Follow industry standards for logging configuration
- ✅ Understand common mistakes and how to avoid them

---

## 📋 Step 3: Activity Instructions

### **Time:** 15-20 minutes

### **Task 1: Create Logback Configuration**
Create `logback.xml` in `src/` with the following:

**Requirements:**
- **Console Appender**: 
  - Pattern with timestamp, thread, level, logger name, and message
  
- **Daily Rolling File Appender**:
  - Current file: `logs/bank-app.log`
  - Archive pattern: `logs/bank-app-%d{yyyy-MM-dd}.log`
  - Keep 30 days of logs
  - Total size cap: 1GB
  
- **Root Logger**: 
  - Level: INFO
  - Reference both appenders (CONSOLE and DAILY_FILE)

---

### **Task 2: Complete BankAccountService.java**

Open `BankAccountService.java` and complete all **30 TODO items**:

**What to do:**
- **TODO 1**: Import and create logger using `LoggerFactory.getLogger(BankAccountService.class)`
- **TODO 2-30**: Add log statements and throw exceptions
- Follow the parameter hints in each TODO comment
- Use parameterized logging with `{}`
- Choose appropriate log levels (INFO, WARN, ERROR, DEBUG)
- Provide meaningful exception messages with context

**Example TODO:**
```java
//TODO 2: Log INFO message "Creating account for owner: {}"
// Parameter: ownerName

// Your solution:
logger.info("Creating account for owner: {}", ownerName);
```

---

### **Task 3: Run and Verify**

1. **Run the test:**
   - Right-click `BankAccountServiceTest.java`
   - Run As → Java Application

2. **Check console output:**
   - Verify all 12 test cases execute
   - Confirm SUCCESS and EXCEPTION results are displayed

3. **Check log file:**
   - Open `logs/bank-app.log`
   - Verify logs contain proper timestamp, level, and messages
   - Confirm exception stack traces are logged for errors

---

## 🛠️ Step 4: Setup Instructions

### **Prerequisites:**
- ✅ Java 17 or higher installed
- ✅ Eclipse IDE or Spring Tool Suite 4 (STS4)
- ✅ This project cloned to your local machine
- ✅ `java-logging` project with library folder available

---

### **How to Import Libraries Manually to Eclipse:**

The required JAR files are located in: `java-logging/library/`

**Required Libraries:**
- `logback-classic-1.4.11.jar`
- `logback-core-1.4.11.jar`
- `slf4j-api-2.0.9.jar`

**Steps to Add Libraries:**

1. **Right-click on your project** in Eclipse Package Explorer

2. **Select:** `Build Path` → `Configure Build Path...`

3. **Click the "Libraries" tab**

4. **Click "Add External JARs..."** button

5. **Navigate to** `java-logging/library/` folder

6. **Select all three JAR files:**
   - Hold `Ctrl` (Windows/Linux) or `Cmd` (Mac)
   - Click on `logback-classic-1.4.11.jar`
   - Click on `logback-core-1.4.11.jar`
   - Click on `slf4j-api-2.0.9.jar`

7. **Click "Open"**

8. **Click "Apply and Close"**

9. **Verify:** Expand "Referenced Libraries" in Package Explorer - you should see all three JARs

**Alternative Method (Drag and Drop):**

1. Create a `lib` folder in your project root (if not exists)
2. Copy the three JAR files into the `lib` folder
3. Select all three JARs in Eclipse Package Explorer
4. Right-click → `Build Path` → `Add to Build Path`

---

## ✅ Submission Checklist

Before submitting, make sure:
- [ ] `logback.xml` is created in `src/`
- [ ] All 30 TODOs in `BankAccountService.java` are completed
- [ ] All libraries are properly imported (no compilation errors)
- [ ] `BankAccountServiceTest.java` runs successfully
- [ ] Console shows all 12 test results
- [ ] `logs/bank-app.log` file is created with proper log entries
- [ ] Code is committed to branch `M4_ACTIVITY9`
- [ ] Changes are pushed to your repository

---

## 🎓 Key Reminders

**Exception Handling:**
- Always catch specific exceptions
- Never leave catch blocks empty
- Include context in error messages
- Preserve original exceptions when rethrowing

**Logging:**
- Use parameterized logging: `logger.info("User: {}", name)`
- Choose appropriate log levels
- Always log exception objects: `logger.error("Error", e)`
- Never log sensitive data (passwords, credit cards)

**Common Mistakes to Avoid:**
- Don't use `System.out.println` - use logger
- Don't log AND rethrow the same exception
- Don't catch `Throwable` or `Error`
- Don't swallow exceptions

---

## 🎉 Good Luck!

You've got this! Remember:
- Read each TODO carefully
- Follow the parameter hints
- Test frequently as you complete TODOs
- Check your logs to verify output
- Don't hesitate to review the lesson slides

**Happy Coding! 🚀**
