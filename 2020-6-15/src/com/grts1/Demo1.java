package com.grts1;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Demo1 {
	private static String A_Name = "a";
	private static String A_PassWord = "a";
	static HashSet<User> a = new HashSet<User>();
	static Scanner s = new Scanner(System.in);
	static TreeMap<Integer, Book> t = new TreeMap<Integer, Book>();

	public static void main(String[] args) {
		a.add(new User(A_Name, A_PassWord));
		b("欢迎来到GRTS书铺");
		while (true) {
			b("请选择你要进行的操作：1注册，2登录，3退出系统");
			String next = s.next();
			if (next.equals("1") || next.equals("2") || next.equals("3")) {
				switch (next) {
				case "1":
					signUp();
					break;
				case "2":
					int verificationCode = verificationCode();
					if (verificationCode == 1) {
						User signIn = signIn();
						if (a.contains(signIn)) {
							if (signIn.getName().equals(A_Name) && signIn.getPassWord().equals(A_PassWord)) {
								while (true) {
									boolean h = true;
									b("请选择你要进行的操作：1添加图书，2删除图书，3修改图书，4查看图书，5退出系统");
									String next2 = s.next();
									if (next2.equals("1") || next2.equals("2") || next2.equals("3") || next2.equals("4")
											|| next2.equals("5")) {
										switch (next2) {
										case "1":
											addBook();
											break;
										case "2":
											deleteBook();
											break;
										case "3":
											updateBook();
											break;
										case "4":
											findOne();
											break;
										case "5":
											h = false;
											b("你已退出");
											break;
										}
										if (!h) {
											break;
										}
									} else {
										b("请按照指示进行操作！！");
									}
								}
							} else if (signIn.getName().equals(null) && signIn.getPassWord().equals(null)) {
								b("登录成功");
							} else {
								while (true) {
									boolean h = true;
									b("请选择你要进行的操作：1查看全部书籍，2购买书籍，3退出系统");
									if (next.equals("1") || next.equals("2") || next.equals("3")) {
										String next3 = s.next();
										switch (next3) {
										case "1":
											fingAll();
											break;
										case "2":
											buy();
											break;
										case "3":
											h = false;
											break;
										}
									} else {
										b("请按照指示进行操作！！");
									}
									if (!h) {
										break;
									}
								}
							}
						}
					}
					break;
				case "3":
					return;
				}
			} else {
				b("请按照指示进行操作！！");
			}
		}
	}

	private static void buy() {
		b("请输入书名");
		String f = s.next();
		Set<Integer> keySet = t.keySet();
		for (Integer integer : keySet) {
			if (t.get(integer).getName().equals(f)) {
				if (t.get(integer).getAmount() > 0) {
					b("单价为：" + t.get(integer).getPrice());
					b("剩余册数为：" + t.get(integer).getAmount());
					b("请问你要进行购买吗？1确定，2返回");
					switch (s.nextInt()) {
					case 1:
						b("请问你要购买几册");
						int p = s.nextInt();
						b(p + "册是吗？");
						b("购买成功！");
						t.get(integer).setAmount(t.get(integer).getAmount() - p);
						break;
					case 2:
						return;
					default:
						break;
					}
				} else {
					b("库存不足！");
				}
			}
		}
	}

	private static void fingAll() {
		Set<Integer> keySet = t.keySet();
		for (Integer integer : keySet) {
			System.out.println("编号为：" + integer + t.get(integer));
		}
	}

	private static void findOne() {
		boolean f = false;
		b("请输入编码");
		int e = s.nextInt();
		Set<Integer> keySet = t.keySet();
		for (Integer integer : keySet) {
			if (integer == e) {
				b("编号为：" + e + t.get(e));
				f = true;
			}
		}
		if (!f) {
			b("你查找的书不存在");
		}

	}

	private static void updateBook() {
		boolean f = false;
		b("请输入编码");
		int e = s.nextInt();
		Set<Integer> keySet = t.keySet();
		for (Integer integer : keySet) {
			if (integer == e) {
				b("请输入你要修改的名字");
				t.get(e).setName(s.next());
				b("请输入你要修改的价格");
				t.get(e).setPrice(s.next());
				f = true;
			}
		}
		if (!f) {
			b("你查找的书不存在");
		}

	}

	private static void deleteBook() {
		boolean f = false;
		b("请输入编码");
		int e = s.nextInt();
		Set<Integer> keySet = t.keySet();
		for (Integer integer : keySet) {
			if (integer == e) {
				t.remove(e);
				f = true;
			}
		}
		if (!f) {
			b("你查找的书不存在");
		}
	}

	private static void addBook() {
		b("请输入编码");
		int e = s.nextInt();
		b("请输入书名");
		String a = s.next();
		b("请输入单价");
		String d = s.next();
		b("请输入库存量");
		int f = s.nextInt();
		t.put(e, new Book(a, d, f));
	}

	private static User signIn() {
		b("请输入你的昵称：");
		String c = s.next();
		b("请输入你的密码：");
		String e = s.next();
		User v = new User(c, e);
		for (User user : a) {
			v.equals(user);
			return user;
		}
		b("登录失败");
		return new User(null, null);
	}

	private static void signUp() {
		b("请输入你的昵称：");
		String c = s.next();
		b("请输入你的密码：");
		String e = s.next();
		User u = new User(c, e);
		if (!a.contains(u)) {
			a.add(u);
			b("注册成功！");
		} else {
			b("账号已存在，请重新操作");
		}

	}

	private static void b(Object o) {
		System.out.println(o);
	}

	private static int verificationCode() {
		Random r = new Random();
		int nextInt = r.nextInt(19) + 1;
		int nextInt1 = r.nextInt(19) + 1;
		int nextInt2 = r.nextInt(5) + 1;
		int d = 0;
		switch (nextInt2) {
		case 1:
			d = nextInt + nextInt1;
			b(nextInt + "+" + nextInt1);
			break;
		case 2:
			d = nextInt - nextInt1;
			b(nextInt + "-" + nextInt1);
			break;
		case 3:
			d = nextInt * nextInt1;
			b(nextInt + "*" + nextInt1);
			break;
		case 4:
			d = nextInt / nextInt1;
			b(nextInt + "/" + nextInt1);
			break;
		case 5:
			d = nextInt % nextInt1;
			b(nextInt + "%" + nextInt1);
			break;
		}
		b("请输入结果");
		int h = s.nextInt();
		if (d == h) {
			return 1;
		} else {
			return -1;
		}
	}
} 
