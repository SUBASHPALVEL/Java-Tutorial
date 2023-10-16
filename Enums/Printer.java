package Enums;

public class Printer {
    private Paper selectedPaper;

    public Paper getSelectedPaper() {
        return selectedPaper;
    }

    public void setSelectedPaper(Paper selectedPaper) {
        this.selectedPaper = selectedPaper;
    }

    public void print(String text){
  
        if(this.selectedPaper==Paper.A1){
            System.out.println("Text is scaled to "+ Paper.A1+ " size");
        }else if(this.selectedPaper==Paper.A2){
            System.out.println("Text is scaled to "+ Paper.A2+ " size");
        }else if(this.selectedPaper==Paper.A3){
            System.out.println("Text is scaled to "+ Paper.A3+ " size");
        }else if(this.selectedPaper==Paper.A4){
            System.out.println("Text is scaled to "+ Paper.A4+ " size");
        }else if(this.selectedPaper==Paper.A5){
            System.out.println("Text is scaled to "+ Paper.A5+ " size");
        }else{
            System.out.println("Please select a paper");
        }

        switch (this.selectedPaper){
        case A1:
                System.out.println("Text is scaled to "+ Paper.A1+ " size");
                break;
        case A2:
                System.out.println("Text is scaled to "+ Paper.A2+ " size");
                break;
        case A3:
                System.out.println("Text is scaled to "+ Paper.A3+ " size");
                break;
        case A4:
                System.out.println("Text is scaled to "+ Paper.A4+ " size");
                break;
        case A5:
                System.out.println("Text is scaled to "+ Paper.A5+ " size");
                break;
            default:
                System.out.println("Please select a paper");
                break;

        }
    }

}
