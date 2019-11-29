class Ex3{

	public String ex3_0(int n){
    String ret = "";
    if (n > 0) {
      ret = "その値は正です";
    } else {
      ret = "その値は０か負です";
    }
		return ret;
	}

	public int ex3_1(int n){
	int ret;
    if (n > 0) {
     ret = n;
    } else {
     ret = n * -1;}
        return ret;

	}

	public String ex3_2(int a, int b){
    String ret = "";
    if (a % b == 0) {
     ret = b + "は" + a + "の約数です";
    } else {
     ret = b + "は" + a + "の約数ではありません";}
		return ret;
	}

	public String ex3_3(int a, int b){
    String ret = "";
    if (a > b) {
     ret = a + "の方が大きいです";
    } if (a < b) {
     ret = b + "の方が大きいです";
    } else if (a == b) {
     ret = "同じ値です";}
		return ret;
	}

	public String ex3_4(int a){
    String ret = "";
    if (a % 5 == 0) {
     ret = "その値は5で割り切れます";
    } if (a < 0) {
     ret = "正でない整数値です";
    } else if (a % 5 != 0){
     ret = "その値は5で割り切れません";}
		return ret;
	}

	public String ex3_5(int a){
    String ret = "";
    if (a % 10 == 0) {
     ret = "その値は10の倍数です";
    } if (a < 0) {
     ret = "正でない整数値です";
    } else if (a % 10 != 0){
     ret = "その値は10の倍数ではありません";}
		return ret;
	}
	
	public String ex3_6(int a){
    String ret = "";
    if (a % 3 == 0) {
     ret = "その値は3で割り切れます";
    } if (a % 3 == 1) {
     ret = "その値を3で割った余りは1です";
    } if (a % 3 == 2) {
     ret = "その値を3で割った余りは2です";
    } else if (a < 0) {
     ret = "正でない整数値です";}
		return ret;
	}

    public String ex3_7(int a){
        String ret = "";
        if (a >= 0 && a < 60) {
            ret = "不可";
        }else if (a >= 60 && a <= 69) {
            ret = "可";
        }else if (a >= 70 && a <= 79) {
            ret = "良";
        }else if (a >= 80 && a <= 100) {
            ret = "優";
        }else {
            ret = "範囲(0～100)外の値です";
        }
        return ret;
    }

	public double ex3_8(double a, double b){
    var ret = Math.max(a, b);
		return ret;
	}

	public int ex3_9(int a, int b){
    int ret = (a - b);
		return ret;
	}

    public String ex3_10(int a, int b){
        String ret = "";
        if ((a - b) >= 11) {
            ret = "それらの差は11以上です";
        } else {
            ret = "それらの差は10以下です";
        }
        return ret;
    }

    public int ex3_11(int a, int b, int c){
        if (a <= b && a <= c) {
            return a; 
        } if (b <= a && b <= c) {
            return b;
        }
        return c;
    }

    public int ex3_12(int a, int b, int c){
        if (a >= b) {
            if (b >= c) {
                return b; // A, B, F, G
            } else if (a <= c) {
                return a; // D, E, H
            } else {
                return c; // C
            }
        } else if (a > c) {
            return a; // I
        } else if (b > c) {
            return c; // J, K
        } else {
            return b; // L, M
        }
    }  


    public String ex3_13(int a){
        String ret = "";
        if (a == 12 || a == 1 || a == 2) {
            ret = "冬";
        } else if (a >= 3 & a <= 5) {
            ret = "春";
        } else if (a >= 6 & a <= 8) {
            ret = "夏";
        } else if (a >= 9 & a <= 11) {
            ret = "秋";
        } else {
            ret = "範囲(1～12)外の値です";}
        return ret;
    }
}

