package netandjson;

import java.io.Serializable;
import java.util.ArrayList;

public class DataEntity implements Serializable{
	/**
	 * ����Դʵ��
	 * {
    "list": [
        {
            "stitle": "����ɫ�ʸ����� LG G4��Ļ�����к�����",
            "sdate": "2015-08-12 09:00:09",
            "type": "0",
            "url": "http://mobile.zol.com.cn/534/5346557.html",
            "id": "5346557",
            "imgsrc": "http://wuxian.fd.zol-img.com.cn/t_s170x300_q7/g2/M00/01/07/ChMlWlXJyrmIIka1AAIUvz3ES00AAHqNwKfI4cAAhTX854.jpg",
            "imgsrc2": "http://article.fd.zol-img.com.cn/t_s640x2000c4/g2/M00/01/08/ChMlWVXJzxiIRWTPAAMdJ0ncgFwAAHqQgDO314AAx0_231.jpg",
            "comment_num": 3
        },
        {
            "stitle": "�������������������г����ۼ�3999Ԫ��",
            "sdate": "2015-08-12 09:00:08",
            "type": "0",
            "url": "http://news.zol.com.cn/534/5347683.html",
            "id": "5347683",
            "imgsrc": "http://2d.zol-img.com.cn/article/12_170x300/665/liuGVOSlV4kM.jpg",
            "imgsrc2": "http://article.fd.zol-img.com.cn/t_s640x2000c4/g2/M00/01/09/ChMlWlXJ-NuITdT1AABvuAylKXAAAHqpgPSkxsAAG_Q809.jpg",
            "comment_num": 54
        },
        {
            "stitle": "�������� iOS9��ֽ��Ϯŵ����Belle",
            "sdate": "2015-08-12 09:00:08",
            "type": "0",
            "url": "http://pad.zol.com.cn/534/5347507.html",
            "id": "5347507",
            "imgsrc": "http://2e.zol-img.com.cn/article/12_170x300/612/liIwDLFMDZYMI.jpg",
            "imgsrc2": "http://article.fd.zol-img.com.cn/t_s640x2000c4/g2/M00/01/07/ChMlWVXJyHeIenHkAAGafDP7X-IAAHqLgMN_igAAZqU351.jpg",
            "comment_num": 24
        },
        {
            "stitle": "1799Ԫ��1999Ԫ��ZUK��һ��2������ɱ",
            "sdate": "2015-08-11 15:35:00",
            "type": "2",
            "id": "5346092",
            "topicid": "5346092",
            "imgsrc": "http://2c.zol-img.com.cn/article/12_170x300/424/lifV3SOaqTY.png",
            "comment_num": 0,
            "imgsrc2": ""
        },
        {
            "stitle": "����������!΢��iOS��ֲӦ��������",
            "sdate": "2015-08-12 09:00:08",
            "type": "0",
            "url": "http://soft.zol.com.cn/534/5346511.html",
            "id": "5346511",
            "imgsrc": "http://2f.zol-img.com.cn/article/12_170x300/427/ligdZfDmHMoY.jpg",
            "imgsrc2": "http://article.fd.zol-img.com.cn/t_s640x2000c4/g2/M00/01/04/ChMlWVXJi9qIcoVuAABr4uq_F84AAHpcwD3eT0AAGv6850.jpg",
            "comment_num": 7
        },
        {
            "stitle": "ǰԱ����ƻ������ΪiPad�з�����ر�",
            "sdate": "2015-08-12 09:00:07",
            "type": "0",
            "url": "http://apple.zol.com.cn/534/5344768.html",
            "id": "5344768",
            "imgsrc": "http://2e.zol-img.com.cn/article/12_170x300/102/liXmaqEkOdlAk.jpg",
            "imgsrc2": "http://article.fd.zol-img.com.cn/t_s640x2000c4/g3/M06/05/07/Cg-4WFTF7-mIHE-3AAjxMSeLhjgAAUNWAJEm_wACPFJ991.jpg",
            "comment_num": 9
        },
        {
            "stitle": "8.13�����ֱ�������� �����ѿ�ʼԤ��",
            "sdate": "2015-08-12 09:00:07",
            "type": "0",
            "url": "http://mobile.zol.com.cn/534/5347303.html",
            "id": "5347303",
            "imgsrc": "http://2d.zol-img.com.cn/article/12_170x300/575/lia8K99hTcJwg.jpg",
            "imgsrc2": "http://article.fd.zol-img.com.cn/t_s640x2000c4/g2/M00/01/07/ChMlWlXJvnCIBvFIAAIMaWT5pkgAAHqDwP9YOYAAgyB148.jpg",
            "comment_num": 9
        },
        {
            "stitle": "�ձ�������PSV��ȷ������ �������²�",
            "sdate": "2015-08-12 09:00:06",
            "type": "0",
            "url": "http://cpu.zol.com.cn/534/5346886.html",
            "id": "5346886",
            "imgsrc": "http://article.fd.zol-img.com.cn/t_s170x300_q7/g2/M00/01/05/ChMlWVXJnW2IQ4e9AABRayyuiIYAAHpoAF3iW4AAFGD071.jpg",
            "imgsrc2": "http://article.fd.zol-img.com.cn/t_s640x2000c4/g2/M00/01/05/ChMlWVXJnW2ILRTSAABFyvueAa4AAHpoAF3Q4wAAEXi166.jpg",
            "comment_num": 4
        },
        {
            "stitle": "����ɳ�С��á�����Ԥ�� ���澪�ˣ�",
            "sdate": "2015-08-12 09:00:05",
            "type": "0",
            "url": "http://mb.zol.com.cn/534/5347687.html",
            "id": "5347687",
            "imgsrc": "http://article.fd.zol-img.com.cn/t_s170x300_q7/g2/M00/01/09/ChMlWlXJ-3GIWllIAACEBxUjqQoAAHqsAASOwYAAIQf045.jpg",
            "imgsrc2": "http://article.fd.zol-img.com.cn/t_s640x2000c4/g2/M00/01/09/ChMlWlXJ-3GIQTi0AAA2VX-gdoIAAHqsAAS9EEAADZt160.jpg",
            "comment_num": 9
        },
        {
            "stitle": "�ȸ�򿪷���ͯ���ͼ����ǿ��������",
            "sdate": "2015-08-12 09:00:05",
            "type": "0",
            "url": "http://news.zol.com.cn/534/5347043.html",
            "id": "5347043",
            "imgsrc": "http://wuxian.fd.zol-img.com.cn/t_s170x300_q7/g2/M00/01/08/ChMlWVXJ1YWIaPd5AAFNmFrlbrwAAHqVAB5l40AAU2w800.jpg",
            "imgsrc2": "http://article.fd.zol-img.com.cn/t_s640x2000c4/g2/M00/01/06/ChMlWVXJthiIU3YyAAXohGjFBmkAAHp8wB2aCQABeic949.jpg",
            "comment_num": 2
        },
        {
            "stitle": "��ʹ����ɱ�֣� ��Ϊ˫�н��Ķ�������",
            "sdate": "2015-08-12 09:00:05",
            "type": "0",
            "url": "http://sound.zol.com.cn/534/5346524.html",
            "id": "5346524",
            "imgsrc": "http://wuxian.fd.zol-img.com.cn/t_s170x300_q7/g2/M00/01/07/ChMlWlXJy2-IIcX5AADeLxjRdLEAAHqOgHA-6EAAN5H863.jpg",
            "imgsrc2": "http://article.fd.zol-img.com.cn/t_s640x2000c4/g2/M00/01/05/ChMlWlXJoPCIL1oAAAMnojf8E3EAAHpqgH2-ssAAye6294.jpg",
            "comment_num": 5
        },
        {
            "stitle": "����WIN10�� �����ϵ������㶼֪����",
            "sdate": "2015-08-12 09:00:04",
            "type": "0",
            "url": "http://mouse.zol.com.cn/534/5345702.html",
            "id": "5345702",
            "imgsrc": "http://wuxian.fd.zol-img.com.cn/t_s170x300_q7/g2/M00/01/07/ChMlWVXJzhiIX716AABZurUHxhgAAHqPwAsOmkAAFnS443.jpg",
            "imgsrc2": "http://article.fd.zol-img.com.cn/t_s640x2000c4/g2/M00/01/05/ChMlWlXJnnqIMyVgAAHmGzQstcAAAHpowHFPswAAeYz455.jpg",
            "comment_num": 6
        },
        {
            "stitle": "��ʵ��С�� ��˶B85M-G PLUS/U3.1����",
            "sdate": "2015-08-12 09:00:03",
            "type": "0",
            "url": "http://mb.zol.com.cn/534/5346106.html",
            "id": "5346106",
            "imgsrc": "http://2e.zol-img.com.cn/article/12_170x300/390/liA0CnALbnspo.jpg",
            "imgsrc2": "http://article.fd.zol-img.com.cn/t_s640x2000c4/g2/M00/01/03/ChMlWlXJaCCIZo7YAANn9m68H58AAHpHgFTAUkAA2gO140.jpg",
            "comment_num": 2
        },
        {
            "stitle": "����ν ����Ϊ �����ѧ����ҵ����ֱ��",
            "sdate": "2015-08-12 06:00:05",
            "type": "5",
            "url": "http://nb.zol.com.cn/534/5346826.html",
            "id": "5346826",
            "pics": [
                "http://zhibo.fd.zol-img.com.cn/t_s170x300_w1/g2/M00/01/05/ChMlWVXJnm6If4DxAD8m_37kFqoAAHpowDzQ6cAPycX564.jpg"
            ],
            "imgsrc2": "http://icon.zol.com.cn/zol_wap_pic/defaultpic.png",
            "comment_num": 8,
            "imgsrc": ""
        },
        {
            "stitle": "�ö��Ѳ���ǿװ�� ��������ȫ������",
            "sdate": "2015-08-10 12:00:05",
            "type": "18",
            "url": "http://m.zol.com/topic/2.html",
            "id": "0",
            "imgsrc": "http://wuxian.fd.zol-img.com.cn/t_s170x300_q7/g2/M00/00/0A/ChMlWlXISh2INRBVAACDVAFwZPMAAHm_gNflLYAAINs938.jpg",
            "imgsrc2": "http://icon.zol.com.cn/zol_wap_pic/defaultpic.png",
            "comment_num": 0,
            "label": ""
        }
    ],
    "num": "52694",
    "doc_update_nums": "0",
    "pics": [
        {
            "id": "5346981",
            "stitle": "10���𾪵�OS Xϸ�����",
            "imgsrc": "http://digital.zol.com.cn/275_module_images/20/55c9d10eb1c4a.jpg",
            "imgsrc2": "http://article.fd.zol-img.com.cn/t_s440x330c4/g2/M00/01/07/ChMlWVXJytSIIM7pAANco6jBCDQAAHqOAAju9oAA1y7764.jpg",
            "type": 0,
            "url": "http://nb.zol.com.cn/534/5346981.html"
        },
        {
            "id": "http://m.zol.com.cn/topic/5340315.html",
            "stitle": "��Ϧլ���ᣡ�Ժ����������㣡Լ��",
            "imgsrc": "http://digital.zol.com.cn/275_module_images/20/55c9a3e250091.jpg",
            "imgsrc2": "http://digital.zol.com.cn/275_module_images/20/55c9a3e250091.jpg",
            "type": "18",
            "url": "http://m.zol.com.cn/topic/5340315.html"
        },
        {
            "id": "5347041",
            "stitle": "��ֻ������ Ӣ�������������㹥��",
            "imgsrc": "http://digital.zol.com.cn/275_module_images/20/55c9d15cd53d1.jpg",
            "imgsrc2": "http://article.fd.zol-img.com.cn/t_s440x330c4/g2/M00/01/08/ChMlWVXJ2mqINMriAAYQtElKnVEAAHqYADqrjQABhDM792.png",
            "type": 0,
            "url": "http://dcdv.zol.com.cn/534/5347041.html"
        }
    ]
}
	 */
	

	private ArrayList<ContentEntity> list;
//	private String num;
//	private String doc_update_nums;
//	private String pics;
//
//	public String getNum() {
//		return num;
//	}
//
//	public void setNum(String num) {
//		this.num = num;
//	}
//
//	public String getDoc_update_nums() {
//		return doc_update_nums;
//	}
//
//	public void setDoc_update_nums(String doc_update_nums) {
//		this.doc_update_nums = doc_update_nums;
//	}
//
//	public String getPics() {
//		return pics;
//	}
//
//	public void setPics(String pics) {
//		this.pics = pics;
//	}
	public DataEntity() {

	}
	
	public ArrayList<ContentEntity> getList() {
		return list;
	}

	public void setList(ArrayList<ContentEntity> list) {
		this.list = list;
	}

}
