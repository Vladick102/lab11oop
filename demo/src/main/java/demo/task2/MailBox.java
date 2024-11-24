package demo.task2;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
  public final MailSender sender;
  List<MailInfo> infos = new ArrayList<>();

  MailBox(MailSender sender) {
    this.sender = sender;
  }

  void addMailInfo(MailInfo mailInfo) {
    infos.add(mailInfo);
  }

  void sendAll() {
    for (MailInfo info : infos) {
      sender.sendEmail(info);
    }
  }
}
