package time;

/**
 * 用来保存提取时间信息的正则表达式
 */
public class TimeData {
    public final static String[][] y = new String[5][60];
    public final static String[][] p = new String[5][60];

    static {
        y[4][0] = "((([半零一两二三四五六七八九十百千万])|(\\d)){1,4})";
        y[4][1] = "(" + y[4][0] + "年)";
        y[4][2] = "(" + y[4][0] + "月)";
        y[4][3] = "(" + y[4][0] + "(号|日))";
        y[4][4] = "(前)";
        y[4][5] = "(昨)";
        y[4][6] = "(今|当)";
        y[4][7] = "(明)";
        y[4][8] = "(后)";
        y[4][9] = "(天|日)";
        y[4][10] = "(大前天|大后天)";
        y[4][11] = "(现在|刚刚)";
        y[4][12] = "(" + y[4][0] + "(点|点钟|时))";
        y[4][13] = "(" + y[4][0] + "(分))";
        y[4][14] = "(" + y[4][0] + "(秒))";
        y[4][15] = "(秒)";
        y[4][16] = "(分(多)*钟)";
        y[4][17] = "(个*[多来半]*)(小时|钟头)";
        y[4][18] = "(傍晚|黄昏)";
        y[4][19] = "(早[上晨间])";
        y[4][20] = "([晌|中]午)";
        y[4][21] = "(上午)";
        y[4][22] = "(下午)";
        y[4][23] = "(晚[上间])";
        y[4][24] = "(白天)";
        y[4][25] = "(夜晚)";
        y[4][26] = "(周|(个)*礼拜|(个)*星期)";
        y[4][27] = "(月)";
        y[4][28] = "(为期|持续(了)*|连续|近)";
        y[4][29] = "(未来)";
        y[4][30] = "(过去)";
        y[4][31] = "(个[多来半]*)";
        y[4][32] = "(上)";
        y[4][33] = "(下)";
        y[4][34] = "(本)";
        y[4][35] = "(半个*)";
        y[4][36] = "(月)";
        y[4][37] = "(年)";
        y[4][38] = "(学期)";
        y[4][39] = "(暑假|寒假)";
        y[4][40] = "(财年|财政年|会计年)";
        y[4][41] = "(早高峰|上班(高峰|路上|时间))";
        y[4][42] = "(晚高峰|下班(高峰|路上|时间))";
        y[4][43] = "((上下班)(高峰|时间|路上))";
        y[4][44] = "(早|夜|晚)";
        y[4][45] = "(大清早|一大早)";
        y[4][46] = "(" + y[4][0] + "(月|月份)的*)";
        y[4][47] = "(第" + y[4][0] + "个)";
        y[4][48] = "((礼拜|星期|周)的*)";
        y[4][49] = "((礼拜|星期|周)[一二三四五六七日末])";
        y[4][50] = "(全天|整天|一整天)";
        y[4][51] = "([甲|乙|丙|丁|戊|己|庚|辛|壬|癸][子|丑|寅|卯|辰|巳|午|未|申|酉|戌|亥]年)";
        y[4][52] = "([正一二三四五六七八九十]+)月";
        y[4][53] = "[一二三四五六七八九十]+";
        y[4][54] = "(初*" + y[4][53] + ")";

        y[0][1] = "(那个|那天|那年|那周|那个月)";
        y[0][0] = "(杭城|杭州)";
        y[0][2] = "(经常|通常|总是|有时|常常|从不|从来不|向来不|几乎不|鲜有|极少时间|基本上|几乎)";
        y[0][3] = "(一周|一星期|一月|一年|一上午|一下午|一晚上|)";
        y[0][4] = "(每天|经常|每次|常常|总是|以前|平时|一直|当时|年年|天天|时不时|目前|每到|每周|隔三差五|十天九天)";
        y[0][5] = "(凌晨|晚上|晚间|夜里|早上|早间|一大早|一大清早|上午|中午|午间|下午|傍晚)*";
        y[0][6] = "(" + y[4][0] + "(\\s+)" + y[4][0] + ")";
        y[0][7] = "(那天|同一天|当年|当时|同一时间)";
        y[0][8] = "(目前|现在|当前|如今|当今|日前|立刻|立即|马上)";
        y[0][9] = "(临时|今后|未来|近期|将来|日后|此后)";
        y[0][10] = "(早日|前景|最近|近来|近日|以往|过去|历届|往日|昔日|以前)";

        y[1][0] = "(" + y[4][0] + "年半)";
        y[1][1] = "(" + y[4][0] + "个半月)";
        y[1][2] = "(" + y[4][0] + "天半)";
        y[1][3] = "(去)";
        y[1][4] = "(第" + y[4][0] + "季度)";
        y[1][5] = "([上下]半年)";
        y[1][6] = "(不[满足到])";
        y[1][7] = "(天|日|号)";
        y[1][8] = "(年)";
        y[1][9] = "(月)";
        y[1][10] = "[以之]前";
        y[1][11] = "(凌晨|清晨)";
        y[1][12] = "(上午|早上)";
        y[1][13] = "(中午|晌午|午后)";
        y[1][14] = "(下午|傍晚)";
        y[1][15] = "(夜里|晚上|午夜|半夜|夜晚)";
        y[1][16] = "(春节|情人节|劳动节|父亲节|母亲节|儿童节|教师节|妇女节|建党节|建军节|(十一)*黄金周|新春佳节)";
        y[1][17] = "(元旦|元宵|清明|五一(劳动)*|端午|重阳|七夕|万圣|中秋|(十一)*国庆|圣诞)节*";

        y[2][0] = "(年|天|周|月|星期|礼拜)(之)*(的)*";
        y[2][1] = "(去|前|大前|过去|昨|(上(个)*)(的)*)";
        y[2][2] = "(明|后|大后|未来|以后|(下(个)*)(的)*)";
        y[2][3] = "(从|在)此之";
        y[2][4] = "(本|这个)";
        y[2][5] = "(周|星期|礼拜)(六|日|天|末)";
        y[2][6] = "(之|以)*";
        y[2][7] = "(不足|不到)*";
        y[2][8] = "(个)*";
        y[2][9] = "(以上|以内|以后)*";
        y[2][10] = "(总是|平时|一直)";

        y[3][0] = "(周|星期|礼拜)";
        y[3][1] = "[一二三四五六日天末]";
        y[3][2] = "(本|这|那)";
        y[3][3] = "上";
        y[3][4] = "下";
        y[3][5] = "(春|夏|秋|冬)";
        y[3][6] = "(季|天|日|立|分|至)";
        y[3][7] = "(雨水|惊蛰|清明|谷雨|小满|芒种|小暑|大暑|处暑|白露|寒露|霜降|小雪|大雪|小寒|大寒)";
        y[3][8] = "来的时候";
        y[3][9] = "(同时|当时)";
        y[3][10] = "(几|近几|数个|未来)";
        y[3][11] = "(秒|分钟|小时|天|日|周|月|年)";
        y[3][12] = "(旬)";
        y[3][13] = "(上)";
        y[3][14] = "(中)";
        y[3][15] = "(下)";

    }

    static {
        String pw0 = "(" + y[4][4] + "|" + y[4][5] + "|" + y[4][6] + "|" + y[4][7] + "|" + y[4][8] + ")";
        p[4][0] = y[4][10];
        p[4][1] = "(" + pw0 + y[4][9] + ")";
        p[4][2] = "(" + y[4][0] + "(\\.|-)" + y[4][0] + "(\\.|-)" + y[4][0] + ")";
        String pw1 = "(" + y[4][1] + "*" + y[4][2] + "*" + y[4][3] + ")";
        String pw2 = "(" + y[4][1] + "*" + y[4][2] + y[4][3] + "*" + ")";
        String pw3 = "(" + y[4][1] + y[4][2] + "*" + y[4][3] + "*" + ")";
        p[4][3] = "(" + pw1 + "|" + pw2 + "|" + pw3 + ")";
        p[4][4] = y[4][11];
        p[4][5] = "(\\d+(:|：)\\d+)";
        String pw4 = "(" + y[4][12] + y[4][13] + "*" + y[4][14] + "*" + ")";
        String pw5 = "(" + y[4][12] + y[4][0] + ")";
        p[4][6] = "(" + pw4 + "|" + pw5 + ")";
        String pw6 = "(" + y[4][28] + "|" + y[4][29] + "|" + y[4][30] + ")";
        p[4][7] = "(" + pw6 + y[4][0] + "(" + y[4][15] + "|" + y[4][26] + "))";
        String pw7 = "(" + y[4][9] + "|" + y[4][16] + ")";
        String pw8 = "(" + y[4][31] + "(" + y[4][18] + "|" + y[4][19] + "|" + y[4][20] + "|" + y[4][21] + "|" + y[4][22] + "|" + y[4][23] + "|" + y[4][24] + "|" + y[4][25] + "|" + y[4][27] + "))";
        p[4][8] = "(" + pw6 + "*" + y[4][0] + "(" + pw7 + "|" + pw8 + ")" + ")";
        String pw9 = "(" + y[4][39] + "|" + y[4][36] + "|" + y[4][37] + y[4][38] + ")";
        String pw10 = "(" + y[4][32] + "|" + y[4][33] + "|" + y[4][34] + ")";
        p[4][9] = "(" + pw10 + y[4][35] + "*" + pw9 + ")";
        p[4][10] = "(" + pw10 + y[4][35] + "*" + y[4][40] + ")";
        String pw11 = "(" + y[4][18] + "|" + y[4][19] + "|" + y[4][20] + "|" + y[4][21] + "|" + y[4][22] + "|" + y[4][23] + "|" + y[4][45] + ")";
        p[4][11] = "(" + y[4][41] + "|" + y[4][42] + "|" + y[4][43] + ")";
        String pw12 = "(" + pw0 + "*" + pw11 + ")";
        String pw13 = "(" + pw0 + y[4][44] + ")";
        p[4][12] = "(" + pw12 + "|" + pw13 + ")";
        String pw14 = "(" + y[4][47] + "(" + y[4][48] + y[4][49] + "|" + y[4][48] + y[4][49] + "))";
        p[4][13] = "(" + y[4][46] + pw14 + ")";
        p[4][14] = y[4][50];
        p[4][15] = "(" + y[4][51] + "*" + y[4][52] + y[4][54] + ")";

        p[0][0] = "(" + y[0][8] + ")";
        p[0][6] = "(" + y[0][9] + ")";
        p[0][7] = "(" + y[0][10] + ")";
        p[0][1] = "(" + y[0][0] + "|" + y[0][1] + y[3][5] + ")";                                       //省略后边的天之类的单位词       //4.3.3  杭城的冬天
        p[0][2] = "(" + y[0][0] + "|" + y[0][1] + y[4][44] + "|" + "下午" + "|" + "中午" + ")";
        p[0][3] = "(" + y[0][2] + ")";
        p[0][4] = y[0][4] + y[0][5] + y[4][0] + "点";  //改正后    频率的每天时间       频率当做-1 0 +1的三个时间
        p[0][5] = "(" + y[0][7] + ")";

        String pz1 = "((" + y[4][0] + "年)*(零)*(" + y[4][0] + "个月))";
        String pz2 = "((" + y[4][0] + "小时)*(零)*(" + y[4][0] + "分|分钟))";
        String pz3 = "((" + y[4][0] + "天)*(零)*(" + y[4][0] + "个*小时))";
        p[1][0] = "(" + y[1][0] + ")|(" + y[1][1] + ")|(" + y[1][2] + ")|(" + pz1 + ")|(" + pz2 + ")|(" + pz3 + ")";
        p[1][1] = "((" + y[4][0] + "|" + y[1][3] + "|" + y[4][4] + "|" + y[4][6] + "|" + y[4][7] + "|" + y[4][8] + ")年((" + y[1][4] + ")|(" + y[1][5] + ")))";
        p[1][2] = "(" + y[1][6] + y[4][0] + "(" + y[1][7] + "|" + y[1][8] + "|" + y[1][9] + "))";
        p[1][3] = "(" + y[4][0] + y[1][8] + ")*(零)*(" + y[4][0] + "(个)*" + y[1][9] + ")*(零)*(" + y[4][0] + y[1][7] + ")*(" + y[1][10] + ")";
        p[1][4] = "(" + y[1][11] + "|" + y[1][12] + "|" + y[1][13] + "|" + y[1][14] + "|" + y[1][15] + ")(" + p[4][5] + "|" + p[4][6] + ")";
        p[1][5] = "(" + y[1][17] + "|" + y[1][16] + ")";
        p[1][6] = "[0-9]*[-][0-9]*[-][0-9]*\\s[0-9]*[:][0-9]*";

        p[2][0] = "(((" + y[4][0] + "|" + y[2][1] + ")" + y[2][0] + ")" + y[2][1] + "(" + y[2][0] + ")*)";
        p[2][1] = "(((" + y[4][0] + "|" + y[2][1] + ")" + y[2][0] + ")" + y[2][2] + "(" + y[2][0] + ")*)";
        p[2][2] = "(((" + y[4][0] + "|" + y[2][2] + ")" + y[2][0] + ")" + y[2][1] + "(" + y[2][0] + ")*)";
        p[2][3] = "(((" + y[4][0] + "|" + y[2][2] + ")" + y[2][0] + ")" + y[2][2] + "(" + y[2][0] + ")*)";
        p[2][4] = "(" + y[2][3] + y[2][1] + ")";
        p[2][5] = "(" + y[2][3] + y[2][2] + ")";
        p[2][6] = "(" + y[2][1] + y[2][5] + ")";
        p[2][7] = "(" + y[2][2] + y[2][5] + ")";
        p[2][8] = "((" + y[2][4] + ")*" + y[2][5] + ")";
        p[2][9] = "(" + p[4][3] + y[2][6] + y[2][1] + y[4][0] + y[2][0] + ")";
        p[2][10] = "(" + p[4][3] + y[2][6] + y[2][2] + y[4][0] + y[2][0] + ")";
        p[2][11] = "(" + p[4][3] + y[2][6] + y[2][1] + ")";
        p[2][12] = "(" + p[4][3] + y[2][6] + y[2][2] + ")";
        p[2][13] = "(" + y[2][7] + y[4][0] + y[2][8] + y[2][0] + "(" + y[2][1] + "|" + y[2][9] + "))";
        p[2][14] = "(" + y[2][7] + y[4][0] + y[2][8] + y[2][0] + "(" + y[2][2] + "|" + y[2][9] + "))";
        p[2][15] = y[2][10];

        String px1 = "(" + y[3][2] + "|" + y[3][3] + "|" + y[3][4] + ")";
        p[3][0] = "(" + px1 + "*" + y[3][0] + y[3][1] + ")";
        p[3][1] = "(" + y[3][5] + y[3][6] + ")";
        p[3][2] = "(" + y[3][7] + ")";
        p[3][3] = "(" + y[3][5] + y[3][6] + y[3][8] + ")";
        p[3][4] = "(" + y[3][9] + ")";
        p[3][5] = "(" + y[3][10] + y[3][11] + ")";
        p[3][6] = "(" + y[4][0] + y[3][12] + ")";
        p[3][7] = "(" + y[4][0] + y[4][27] + "(" + y[3][13] + "|" + y[3][14] + "|" + y[3][15] + ")" + y[3][12] + ")";

    }
}


