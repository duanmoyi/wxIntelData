package intel.data.app.db.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by duanmoyi on 2017/2/18.
 */
@Entity
@Table(name = "db_news_info")
public class News implements Serializable {
    private static final long serialVersionUID = 4199278151161445551L;
    private Integer id;
    private String title;
    private String url;
    private String pubTime;
    private String source;
    private String content;
    private String addTime;
    private Integer agreeNum;
    private Integer opposeNum;
    private String headImg1;
    private String headImg2;
    private String headImg3;
    private String newsType;

    @Id
    @Column (name = "id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Column(name = "pub_time")
    public String getPubTime() {
        return pubTime;
    }

    public void setPubTime(String pubTime) {
        this.pubTime = pubTime;
    }

    @Column(name = "source")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Column(name = "add_time")
    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    @Column(name = "agree_num")
    public Integer getAgreeNum() {
        return agreeNum;
    }

    public void setAgreeNum(Integer agreeNum) {
        this.agreeNum = agreeNum;
    }

    @Column(name = "oppose_num")
    public Integer getOpposeNum() {
        return opposeNum;
    }

    public void setOpposeNum(Integer opposeNum) {
        this.opposeNum = opposeNum;
    }

    @Column(name = "head_img1")
    public String getHeadImg1() {
        return headImg1;
    }

    public void setHeadImg1(String headImg1) {
        this.headImg1 = headImg1;
    }

    @Column(name = "head_img2")
    public String getHeadImg2() {
        return headImg2;
    }

    public void setHeadImg2(String headImg2) {
        this.headImg2 = headImg2;
    }

    @Column(name = "head_img3")
    public String getHeadImg3() {
        return headImg3;
    }

    public void setHeadImg3(String headImg3) {
        this.headImg3 = headImg3;
    }

    @Column(name = "news_type")
    public String getNewsType() {
        return newsType;
    }

    public void setNewsType(String newsType) {
        this.newsType = newsType;
    }
}
