
public class PrintBanner extends Banner implements Print{
	public PrintBanner(String string) {
		super(string);
	}
	@Override
	public void printWeak() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		showWithParen();
	}
	@Override
	public void printStrong() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		showWithAster();
	}
}
