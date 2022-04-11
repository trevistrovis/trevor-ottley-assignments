import java.util.Date;
public class AlfredQuotes {

    public String basicGreeting() {
        return "Greetings, young chap. Lovely day, innit";
    }

    public String guestGreeting(String name, String timeOfDay){
        return String.format("Well good %s, %s", timeOfDay, name);
    }

    public String dateAnnouncement(){
        return String.format("Ahh.. The time you say?? Well, it is %s, and yes... I have relayed the entire date along with it... Master", new Date());
    }

    public String respondBeforeAlexis(String conversation){
        if (conversation.indexOf("Alexis") > -1){
            return "She really has no way around words sir. How may I assist you?";
        }

        if (conversation.indexOf("Alfred") > -1){
            return "I presume I must oblidge... May I help in any way at all sir?";
        }

        return "Right. And with that, I shall retire";
    }

    public String alfredFarts(String name){
        return String.format("Pfft... Oh dear %s... I believe I have passed wind. My sincerest apologies.", name);
    }
    
}
