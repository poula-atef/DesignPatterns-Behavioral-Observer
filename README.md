# ايه هو البرنامج ده؟
- البرنامج ده هو عباره عن مثال لل Observer Design Pattern باستخدام لغة java
# بنستخدم امتي ال Design Pattern ده؟
- لما يكون عندي object بيعمل عمليه معينه و في objects تانيين مهتمين بنتيجة العمليه دي .. عشان كده ال objects دول بيفضلوا متابعين ال object الاول اللي هيعمل العمليه عشان اي جديد يحصل من ال object ده كلهم يعرفوا 
- ال package بتاعت ال enums:
  - ال NotificationsTypes Enum
- ال package بتاعت ال listeners:
  - ال Listener Interface و ده فيه ال methods اللي المفروض تكون في اي listener
  - ال EmailListener و ده class بيعمل implementation لل listener interface
- ال package بتاعت ال publishers:
  - ال NotificationService و ده ال publisher الرئيسي في البرنامج ده
