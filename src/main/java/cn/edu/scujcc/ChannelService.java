package cn.edu.scujcc;

import java.util.List;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * �ṩģ���Ƶ������
 * @author ��̬�ɾ�
 *
 */
@Service
public class ChannelService {
	private List<Channel> channels = new ArrayList<>();
	
	public void ChannaIServuce() {
		for(int i=1;i<=10;i++) {
			Channel c=new Channel();
			c.setId(i);
			c.setTitle("Ƶ��"+i);
			c. setQuality("����");
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
