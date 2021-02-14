# -*- coding: utf-8 -*-
"""
Created on Sat Feb 13 20:32:47 2021

@author: vishn
"""

############# SCRIPT TO AUTOMATICALLY GENERATE SQL QUERIES WITH VALUES FOR INSERTION########


# =============================================================================
# Apologies if I broke any rule of AU by writing this script but I found it very time 
# consuming to enter values into each table. Hence I wrote this to save time thats it.
# Still if there's anything, feel free to tell me, I'll happily redo it 
# =============================================================================


import names
from random import randint
from faker import Faker
import os
import math
os.chdir('C:\Accolite\Accolite University\SQL Concepts & Fundamentals-Afternoon')
fake=Faker()

#====================TABLE 1 (StudentBasicInformation) ====================#

for i in range(20):
    preStr="INSERT into StudentBasicInformation VALUES ('{}','{}','{}','{}','{}','{}','{}');\n".format(names.get_first_name(), names.get_last_name(), randint(10, 9999999), fake.address(), names.get_full_name(gender='male'), names.get_full_name(gender='female'), randint(1, 13))
    with open('Table1_Records_Insert.txt','a') as f:
        f.write(preStr)
    #print(preStr)


#====================TABLE 2 (StudentAdmissionPaymentDetails) ====================#

li=['Cheque','Demand Draft','Cash','Credit Card','Debit Card','Net Banking','UPI']
Y_NO=['yes','no']

for i in range(15):
    preStr_2="INSERT into StudentAdmissionPaymentDetails VALUES('{}','{}','{}','{}','{}','{}','{}');\n".format(randint(10, 9999999), randint(10000,200000), randint(0, 190000), randint(0,10000), li[randint(0,6)], Y_NO[randint(0, 1)], Y_NO[randint(0, 1)])
    with open('Table2_Records_Insert.txt','a') as f:
        f.write(preStr_2)
        
        
#====================TABLE 3 (StudentSubjectInformation)============================#
        
subLi=['Astronomy','Biology','Biomedical', 'Sciences','Chemistry','Earth Sciences', 'Environmental Sciences', 'Food Science and Technology', 'General Sciences', 'Life Sciences', 'Materials Sciences', 'Mathematics', 'Physical Geography', 'Physics', 'Sports Science']
   
for i in range(15):
    strt=randint(0,12)
    endd=randint(strt+1, 14)
    subj=""
    for item in subLi[strt:endd]:
        subj+=item
        subj+=","
    subj=subj[:-1]
    totMarks=(endd-strt)*100
    obtMar=randint(0, totMarks)
    obtPer=round((obtMar/totMarks),4)*100
    if math.floor(obtPer)==math.ceil(obtPer):
        obtPer=float(str(math.trunc(obtPer))+".13")
    isPass="YES"
    if obtPer<33:
        isPass="NO"
    preStr_3="INSERT into StudentSubjectInformation VALUES('{}','{}','{}','{}','{}','{}');\n".format(subj, randint(10, 9999999), totMarks, obtMar, obtPer,isPass)
    with open('Table3_Records_Insert.txt','a') as f:
        f.write(preStr_3)
        
#=================== TABLE 4 (SubjectScholarshipInformation)=======================#
        
# DATA SCRAPED FROM: www.buddy4study.com        
scholarList=[('L’Oréal India For Young Women in Science Scholarships','L’Oréal India offers Young Women in Science Scholarships for young meritorious girls who come from economically weaker sections to pursue undergraduate studies in fields like Engineering, Medical, Applied Sciences and Pure Sciences.',25000,'Private',2,'INR'),
             ('CLP India Scholarship Scheme','CLP India has also launched its scholarship scheme for students of class 10 to 12, graduation, diploma, vocational training and postgraduate courses. The scholarship is limited to the regions of Maharashtra, Rajasthan, Gujarat, Karnataka, Telangana, Tamil Nadu and Madhya Pradesh.',1800,'Private',4,'USD'),
             ('Sitaram Jindal Foundation Scholarship Scheme','Sitaram Jindal Foundation offers a number of scholarships for students at different levels of education. It also offers undergraduate scholarships for students of up to INR 1,000 per month. To be eligible for this scholarship, the students must have obtained at least 60% marks (for boys) and 55% marks (for girls) in the qualifying examination. If students from West Bengal or Karnataka are applying, the percentage criteria for boys and girls is 70% and 65% (for Karnataka) and 65% and 60% (for West Bengal) respectively.',12000,'Semi-Government',4,'INR'),
             ('NIU Scholarship cum Admission Test (NSAT)','The Noida International University (NIU) offer scholarships to students applying for undergraduate or postgraduate courses. Applicable only for courses like BTech, BTech + MBA, BTech + MTech, MBA, BBA, BBA + MBA, BALLB, BBALLB, BAJMC, the scholarship is given on the basis of students’ performance in NSAT.',8500,'Private',3,'INR'),
             ('Raman Kant Munjal Scholarship','An initiative of Hero Group, this undergraduate scholarship is meant to support the education of meritorious students who need financial support to pursue vocational and higher education. the students pursuing an undergraduate degree course can avail this scholarship if their age is more than 19 years as on the date of application, and they have scored at least 65% marks in class 12 examination. Also, the family income should be less than INR 6 Lakhs per annum.',730000,'Private',3,'INR'),
             ('HERO INDIA','This is one of the most popular undergraduate scholarships in India that aims to encourage young women to pursue a career in Science stream. It is a merit-based scholarship that is rewarded to exceptionally meritorious girls who opt for a BSc program in natural or pure science.',2400,'Private',2,'INR'),
             ('The Anant Fellowship','This fellowship by the Anant National University is open to students and practitioners from any discipline like architecture, design, planning, environmental science and engineering, civil and construction engineering. The fellowship would prepare students to take on key architectural, design, planning, and sustainability challenges of India and the world.',100000,'Government',4,'INR'),
             ('Japanese Government (MEXT) Scholarships','For students who are willing to pursue an undergraduate degree in Humanities, Social Sciences, and Natural Science at a University in Japan, the Ministry of Education, Sports, Science and Technology (MEXT), Government of Japan is offering undergraduate scholarships.',117000,'Foreign',4,'YEN')]

#Ignoring the insertion of long descriptions (even though captured) to maintain the aesthetic of table

count=1

for i in range(15):
    sCat=randint(0, 7)
    preStr_4="INSERT into SubjectScholarshipInformation Values('{}','{}','{}',{},'{}','{}','{}');\n".format(randint(10, 9999999),scholarList[sCat][0],"DESCRIPTION - "+str(count),scholarList[sCat][2],scholarList[sCat][3],scholarList[sCat][4],scholarList[sCat][5])
    count+=1
    with open('Table4_Records_Insert.txt','a') as f:
        f.write(preStr_4)
        
