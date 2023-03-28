package src.java.mission3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StudentManage {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Student> list = new ArrayList<>();
        Student student1 = new Student("张三", 18, RdId(), "2000-02-01");
        Student student2 = new Student("王三", 14, RdId(), "2001-03-04");
        Student student3 = new Student("刘三", 12, RdId(), "2004-04-01");
        list.add(student1);
        list.add(student2);
        list.add(student3);
        System.out.println(list.get(1));
        Scanner scanner = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("请选择操作：");
        System.out.println("1.查看所有学生");
        System.out.println("2.添加学生");
        System.out.println("3.删除学生");
        System.out.println("4.按学号查找学生");
        System.out.println("5.按姓名查找学生");
        System.out.println("6.按年龄查找学生");
        System.out.println("7.按出生日期查找学生");
        System.out.println("8.退出程序");
        int x = scanner.nextInt();
        switch (x) {
            case 1:
                Check(list);
                break;
            case 2:
                Add(list);
                break;
            case 3:
                Del(list);
                break;
            case 4:
                IdFind(list);
                break;
            case 5:
                NameFind(list);
                break;
            case 6:
                AgeFind(list);
                break;
            case 7:
                BirthFind(list);
                break;
            case 8:
                System.out.println("再见！");
                break;
            default:
                System.out.println("非法输入！");
                break;
        }


    }

    public static int RdId() {
        Random random = new Random();
        int id = 100000 + random.nextInt(899999);
        return id;
    }

    public static void Check(ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("姓名：" + list.get(i).getName() + "\t" + "年龄：" + list.get(i).getAge() + "\t" + "学号：" + list.get(i).getId() + "\t" + "生日：" + list.get(i).getBrith());
        }

    }

    public static void Add(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名:");
        String name = sc.next();
        System.out.println("请输入年龄:");
        int age = sc.nextInt();
        System.out.println("请输入学号:");
        int id = sc.nextInt();
        System.out.println("请输入生日:");
        String birth = sc.next();
        // 2. 将键盘录入的信息封装为学生对象
        Student student = new Student(name, age, id, birth);
        // 3. 将封装好的学生对象, 添加到集合容器当中
        list.add(student);
        // 4. 给出添加成功的提示信息
        System.out.println("添加成功!");
    }

    public static void Del(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除学生的学号：");
        Boolean flag = true;
        int id = sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(i);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("删除成功");
        } else System.out.println("该生不存在！");

    }

    public static void IdFind(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找学生的学号：");
        Boolean flag = true;
        int id = sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                flag = false;
                System.out.println("查找信息如下：");
                System.out.println("姓名：" + list.get(i).getName() + "\t" + "年龄：" + list.get(i).getAge() + "\t" + "学号：" + list.get(i).getId() + "\t" + "生日：" + list.get(i).getBrith());
            }
        }
        if (flag) {
            System.out.println("该生不存在！");
        }
    }
        public static void NameFind (ArrayList < Student > list) {
            Scanner sc = new Scanner(System.in);
            Boolean flag = true;
            System.out.println("请输入要查找学生的姓名：");
            String name = sc.nextLine();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getName().equals(name)) {
                    System.out.println("姓名：" + list.get(i).getName() + "\t" + "年龄：" + list.get(i).getAge() + "\t" + "学号：" + list.get(i).getId() + "\t" + "生日：" + list.get(i).getBrith());
                    flag = false;
                }
            }
            if (flag){
                System.out.println("该生不存在！");
            }
        }
        public static void AgeFind (ArrayList < Student > list) {
            Scanner sc = new Scanner(System.in);
            Boolean flag = true;
            System.out.println("请输入要查找学生的学号：");
            int age = sc.nextInt();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getAge() == age) {
                    System.out.println("姓名：" + list.get(i).getName() + "\t" + "年龄：" + list.get(i).getAge() + "\t" + "学号：" + list.get(i).getId() + "\t" + "生日：" + list.get(i).getBrith());
                    flag = false;
                }
            }
            if (flag){
                System.out.println("该生不存在！");
            }
        }
        public static void BirthFind (ArrayList < Student > list) {
            Scanner sc = new Scanner(System.in);
            Boolean flag = true;
            System.out.println("请输入要查找学生的出生日期：");
            String birth = sc.nextLine();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getBrith().equals(birth)) {
                    System.out.println("姓名：" + list.get(i).getName() + "\t" + "年龄：" + list.get(i).getAge() + "\t" + "学号：" + list.get(i).getId() + "\t" + "生日：" + list.get(i).getBrith());
                    flag = false;
                }
            }
            if(flag){
                System.out.println("该生不存在！");
            }
        }
    }
