package com.example.praktikum_tugas3;


import com.example.praktikum_tugas3.GenshinModel;

import java.util.ArrayList;

public class GenshinData {



    private static String[] image = new String[] {
            "https://uploadstatic-sea.mihoyo.com/contentweb/20200609/2020060915105012670.png",
            "https://uploadstatic-sea.mihoyo.com/contentweb/20200616/2020061611215344626.png",
            "https://uploadstatic-sea.mihoyo.com/contentweb/20200828/2020082817353421694.png",
            "https://uploadstatic-sea.mihoyo.com/contentweb/20200828/2020082817205925817.png",
            "https://uploadstatic-sea.mihoyo.com/contentweb/20200828/2020082817153781489.png",
            "https://uploadstatic-sea.mihoyo.com/contentweb/20191122/2019112211143037621.png",
            "https://uploadstatic-sea.mihoyo.com/contentweb/20201123/2020112310504363585.png",
            "https://uploadstatic-sea.mihoyo.com/contentweb/20210122/2021012210230256301.png",
            "https://uploadstatic-sea.mihoyo.com/contentweb/20210105/2021010519313139859.png",
            "https://uploadstatic-sea.mihoyo.com/contentweb/20200103/2020010311014850622.png",
            "https://uploadstatic-sea.mihoyo.com/contentweb/20201103/2020110322011046810.png",
            "https://uploadstatic-sea.mihoyo.com/contentweb/20201216/2020121611271023422.png",
            "https://uploadstatic-sea.mihoyo.com/contentweb/20210224/2021022411345864283.png",
            "https://uploadstatic-sea.mihoyo.com/contentweb/20200305/2020030519413867244.png"
    };

    private static String[] name = new String[]{
            "Diluc",
            "Jean",
            "Mona",
            "Keqing",
            "Qiqi",
            "Venti",
            "Zhongli",
            "Xiao",
            "Ganyu",
            "Klee",
            "Childe",
            "Albedo",
            "Hutao",
            "Ningguang"
    };

    private static String[] vision = new String[] {
            "Pyro",
            "Anemo",
            "Hydro",
            "Electro",
            "Cryo",
            "Anemo",
            "Geo",
            "Anemo",
            "Cryo",
            "Pyro",
            "Hydro",
            "Geo",
            "Pyro",
            "Geo"
    };

    public static String[] summary = new String[] {
            "The tycoon of a winery empire in Mondstadt, unmatched in every possible way.",
            "The righteous and rigorous Dandelion Knight, and Acting Grand Master of Mondstadt.",
            "A mysterious young astrologer who proclaims herself to be 'Astrologist Mona Megistus,' and who possesses abilities to match the title.",
            "The Yuheng of the Liyue Qixing. Has much to say about Rex Lapis unilateral approach to policymaking in Liyue - but in truth, gods admire skeptics such as her quite a lot.",
            "An apprentice and herb-picker Bubu Pharmacy. An undead with a bone-white complexion, she seldom has much in the way of words or emotion.",
            "One of the many bards of Mondstadt, who freely wanders the city's streets and alleys.",
            "A mysterious guest invited by the Wangsheng Funeral Parlor. Extremely knowledgeable in all things.",
            "A yaksha adeptus that defends Liyue. Also heralded as the 'Conqueror of Demons' or 'Vigilant Yaksha'.",
            "The secretary at Yuehai Pavilion. The blood of the qilin, an illuminated beast, flows within her veins.",
            "An explosives expert and a regular at the Knights of Favonius' confinement room. Also known as Fleeing Sunlight.",
            "No. 11 of The Harbingers, also known as 'Childe'. His name is highly feared on the battlefield.",
            "An alchemist based in Mondstadt, in the service of the Knights of Favonius.",
            "Hu Tao is the 77th Director of the Wangsheng Funeral Parlor, a person vital to managing Liyue's funerary affairs.",
            "The Tianquan of Liyue Qixing. Her wealth is unsurpassed in all of Teyvat."
    };

    public static ArrayList<GenshinModel> getListData(){
        GenshinModel GenshinModel = null;
        ArrayList<GenshinModel> list = new ArrayList<>();
        for(int i=0;i<image.length;i++){
            GenshinModel = new GenshinModel();
            GenshinModel.setImage(image[i]);
            GenshinModel.setName(name[i]);
            GenshinModel.setVision(vision[i]);
            GenshinModel.setSummary(summary[i]);
            list.add((GenshinModel));
        }
        return list;
    }
}