package cn.luorenmu.request.mihoyo.entiy.data;

import cn.luorenmu.request.mihoyo.entiy.MihoyoResponse;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.annotation.JSONType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author LoMu
 * Date 2023.11.18 16:45
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ForumCollectList extends MihoyoResponse {
    private CollectListData data;

    @Data
    @JSONType(naming = PropertyNamingStrategy.SnakeCase)
    public static class ForumArticleSimple {
        private String postId;
        private String subject;
        private String content;
        private String banner;
        private String collectionId;
        private long createdAt;
        private long replyNum;
        private long likeNum;
        private String collectionTitle;
        private int viewType;
        private boolean isMentor;
    }

    @Data
    public static class CollectListData {
        private List<ForumArticleSimple> list;
    }
}
