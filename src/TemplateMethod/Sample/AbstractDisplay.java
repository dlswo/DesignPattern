package TemplateMethod.Sample;

public abstract class AbstractDisplay { // ���ۃN���XAbstractDisplay
    public abstract void open();        // �T�u�N���X�Ɏ������܂����钊�ۃ��\�b�h(1) open
    public abstract void print();       // �T�u�N���X�Ɏ������܂����钊�ۃ��\�b�h(2) print
    public abstract void close();       // �T�u�N���X�Ɏ������܂����钊�ۃ��\�b�h(3) close
    public final void display() {       // ���̒��ۃN���X�Ŏ������Ă��郁�\�b�hdisplay
        open();                             // �܂�open���āc
        for (int i = 0; i < 5; i++) {       // 5��print���J��Ԃ��āc
            print();                    
        }
        close();                            // �c�Ō��close����B���ꂪdisplay���\�b�h�Ŏ�������Ă�����e�B
    }
}
