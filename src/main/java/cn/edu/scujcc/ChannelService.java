package cn.edu.scujcc;

import java.util.List;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * 提供模拟的频道数据
 * @author 憨态可拘
 *
 */
@Service
public class ChannelService {
	private List<Channel> channels = new ArrayList<>();
	
	public void ChannaIServuce() {
		for(int i=1;i<=10;i++) {
			Channel c=new Channel();
			c.setId(i);
			c.setTitle("频道"+i);
			c. setQuality("高清");
			c. setUrl("http://scujcc.cn");
			channels.add(c);
		}
	}
	public List<Channel> getAllChannels(){
		return this. channels;
	}
	public Channel getChannel(int id) {
		Channel result = null;
		for (Channel c: this. channels) {
			if (id == c.getId()) {
					result = c;
					break ;
			}
		}
		return result;
	}

}
