package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class NormalNoise extends JFrame{
    public static int x[] = {51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73,
            74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100,
            101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122,
            123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144,
            145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166,
            167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188,
            189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210,
            211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232,
            233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 254,
            255, 256, 257, 258, 259, 260, 261, 262, 263, 264, 265, 266, 267, 268, 269, 270, 271, 272, 273, 274, 275, 276,
            277, 278, 279, 280, 281, 282, 283, 284, 285, 286, 287, 288, 289, 290, 291, 292, 293, 294, 295, 296, 297, 298,
            299, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310, 311, 312, 313, 314, 315, 316, 317, 318, 319, 320,
            321, 322, 323, 324, 325, 326, 327, 328, 329, 330, 331, 332, 333, 334, 335, 336, 337, 338, 339, 340, 341, 342,
            343, 344, 345, 346, 347, 348, 349, 350, 351};
    public static int y[] = new int[300];
    public static int n = y.length;

    public static int x1[] = {400, 401, 402, 403, 404, 405, 406, 407, 408, 409, 410, 411, 412, 413, 414, 415, 416, 417,
            418, 419, 420, 421, 422, 423, 424, 425, 426, 427, 428, 429, 430, 431, 432, 433, 434, 435, 436, 437, 438,
            439, 440, 441, 442, 443, 444, 445, 446, 447, 448, 449, 450, 451, 452, 453, 454, 455, 456, 457, 458, 459,
            460, 461, 462, 463, 464, 465, 466, 467, 468, 469, 470, 471, 472, 473, 474, 475, 476, 477, 478, 479, 480,
            481, 482, 483, 484, 485, 486, 487, 488, 489, 490, 491, 492, 493, 494, 495, 496, 497, 498, 499, 500, 501,
            502, 503, 504, 505, 506, 507, 508, 509, 510, 511, 512, 513, 514, 515, 516, 517, 518, 519, 520, 521, 522,
            523, 524, 525, 526, 527, 528, 529, 530, 531, 532, 533, 534, 535, 536, 537, 538, 539, 540, 541, 542, 543,
            544, 545, 546, 547, 548, 549, 550, 551, 552, 553, 554, 555, 556, 557, 558, 559, 560, 561, 562, 563, 564,
            565, 566, 567, 568, 569, 570, 571, 572, 573, 574, 575, 576, 577, 578, 579, 580, 581, 582, 583, 584, 585,
            586, 587, 588, 589, 590, 591, 592, 593, 594, 595, 596, 597, 598, 599, 600, 601, 602, 603, 604, 605, 606,
            607, 608, 609, 610, 611, 612, 613, 614, 615, 616, 617, 618, 619, 620, 621, 622, 623, 624, 625, 626, 627,
            628, 629, 630, 631, 632, 633, 634, 635, 636, 637, 638, 639, 640, 641, 642, 643, 644, 645, 646, 647, 648,
            649, 650, 651, 652, 653, 654, 655, 656, 657, 658, 659, 660, 661, 662, 663, 664, 665, 666, 667, 668, 669,
            670, 671, 672, 673, 674, 675, 676, 677, 678, 679, 680, 681, 682, 683, 684, 685, 686, 687, 688, 689, 690,
            691, 692, 693, 694, 695, 696, 697, 698, 699,};
    public static int y1[] = new int[300];
    public static int n1 = y1.length;

    public static int x2[] = {749, 750, 751, 752, 753, 754, 755, 756, 757, 758, 759, 760, 761, 762, 763, 764, 765,
            766, 767, 768, 769, 770, 771, 772, 773, 774, 775, 776, 777, 778, 779, 780, 781, 782, 783, 784, 785, 786,
            787, 788, 789, 790, 791, 792, 793, 794, 795, 796, 797, 798, 799, 800, 801, 802, 803, 804, 805, 806, 807,
            808, 809, 810, 811, 812, 813, 814, 815, 816, 817, 818, 819, 820, 821, 822, 823, 824, 825, 826, 827, 828,
            829, 830, 831, 832, 833, 834, 835, 836, 837, 838, 839, 840, 841, 842, 843, 844, 845, 846, 847, 848, 849,
            850, 851, 852, 853, 854, 855, 856, 857, 858, 859, 860, 861, 862, 863, 864, 865, 866, 867, 868, 869, 870,
            871, 872, 873, 874, 875, 876, 877, 878, 879, 880, 881, 882, 883, 884, 885, 886, 887, 888, 889, 890, 891,
            892, 893, 894, 895, 896, 897, 898, 899, 900, 901, 902, 903, 904, 905, 906, 907, 908, 909, 910, 911, 912,
            913, 914, 915, 916, 917, 918, 919, 920, 921, 922, 923, 924, 925, 926, 927, 928, 929, 930, 931, 932, 933,
            934, 935, 936, 937, 938, 939, 940, 941, 942, 943, 944, 945, 946, 947, 948, 949, 950, 951, 952, 953, 954,
            955, 956, 957, 958, 959, 960, 961, 962, 963, 964, 965, 966, 967, 968, 969, 970, 971, 972, 973, 974, 975,
            976, 977, 978, 979, 980, 981, 982, 983, 984, 985, 986, 987, 988, 989, 990, 991, 992, 993, 994, 995, 996,
            997, 998, 999, 1000, 1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010, 1011, 1012, 1013, 1014,
            1015, 1016, 1017, 1018, 1019, 1020, 1021, 1022, 1023, 1024, 1025, 1026, 1027, 1028, 1029, 1030, 1031,
            1032, 1033, 1034, 1035, 1036, 1037, 1038, 1039, 1040, 1041, 1042, 1043, 1044, 1045, 1046, 1047, 1048,};
    public static int y2[] = new int[300];
    public static int n2 = y2.length;

    public static void main(String[] args) throws IOException {
        File mFileImage = new File("src//com//company//image//NormalNoise.png");
        BufferedImage mImage = ImageIO.read(mFileImage);
        WritableRaster raster = mImage.getRaster();

        BufferedImage mImageSave = ImageIO.read(mFileImage);
        WritableRaster rasterSave = mImageSave.getRaster();

        BufferedImage mImageLoad = ImageIO.read(mFileImage);
        WritableRaster rasterLoad = mImageLoad.getRaster();

        int[] mas = new int[300];
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < raster.getWidth(); j++) {
                mas[j] = 490 - raster.getSample(j, i, 0);
            }
        }
        y = mas;
        n = y.length;

        Print(raster);
        mImage.setData(raster);
        ImageIO.write(mImage, "png", new File("image1.png"));

        for (int i = 0; i < raster.getHeight(); i++) { ////первая производная
            for (int j = 0; j < raster.getWidth() - 1; j++) {
                if (j < 24 || j > 280){
                    int buffer = raster.getSample(j + 1, i, 0);
                    int buffer2 = raster.getSample(j, i, 0);
                    int buffer3 = Math.abs(buffer - buffer2);
                    raster.setSample(j, i, 0, buffer3);
                    raster.setSample(j, i, 1, buffer3);
                    raster.setSample(j, i, 2, buffer3);
                }
                else{
                    int buffer = raster.getSample(j + 1, i, 0);
                    int buffer2 = raster.getSample(j, i, 0);
                    int buffer3 = Math.abs(buffer - buffer2);
                    raster.setSample(j, i, 0, 150 + buffer3);
                    raster.setSample(j, i, 1, 150 + buffer3);
                    raster.setSample(j, i, 2, 150 + buffer3);
                }
                if (raster.getWidth() - 1 == j + 1){
                    raster.setSample(j + 1, i, 0, 0);
                    raster.setSample(j + 1, i, 1, 0);
                    raster.setSample(j + 1, i, 2, 0);
                }
            }
        }

        int[] mas1 = new int[300];
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < raster.getWidth(); j++) {
                mas1[j] = 490 - raster.getSample(j, i, 0);
            }
        }
        y1 = mas1;
        n1 = y1.length;

        Print(raster);
        mImage.setData(raster);
        ImageIO.write(mImage, "png", new File("image2.png"));

        for (int i = 0; i < rasterSave.getHeight(); i++) { //вторая производная
            for (int j = 1; j < rasterSave.getWidth() - 1; j++) {
                int buffer = rasterLoad.getSample(j + 1, i, 0);
                int buffer2 = rasterLoad.getSample(j - 1, i, 0);
                int buffer3 = Math.abs(buffer + buffer2 - (rasterLoad.getSample(j, i, 0) * 2));
                rasterSave.setSample(j, i, 0, buffer3);
                rasterSave.setSample(j, i, 1, buffer3);
                rasterSave.setSample(j, i, 2, buffer3);
                if (rasterSave.getWidth() - 2  <= j){
                    rasterSave.setSample(j + 1, i, 0, 0);
                    rasterSave.setSample(j + 1, i, 1, 0);
                    rasterSave.setSample(j + 1, i, 2, 0);
                }
            }
        }


        int[] mas2 = new int[300];
        mas2[0] = 490;
        mas2[rasterSave.getWidth() - 1] = 490;
        for (int i = 0; i < 1; i++) {
            for (int j = 1; j < rasterSave.getWidth() - 1; j++) {
                mas2[j] = 490 - ((rasterLoad.getSample(j + 1, i, 0) + rasterLoad.getSample(j - 1, i, 0) - (rasterLoad.getSample(j, i, 0) * 2)));
            }
        }
        y2 = mas2;
        n2 = y2.length;

        Print(rasterSave);
        mImage.setData(rasterSave);
        ImageIO.write(mImage, "png", new File("image3.png"));

        new com.company.NormalNoise().setVisible(true);
    }

    public NormalNoise() {
        super("График по точкам");
        JPanel jcp = new JPanel(new BorderLayout());
        setContentPane(jcp);
        DrawingComponent drawingComponent = new DrawingComponent();
        drawingComponent.xg = x;
        drawingComponent.yg = y;
        drawingComponent.ng = n;
        drawingComponent.xg1 = x1;
        drawingComponent.yg1 = y1;
        drawingComponent.ng1 = n1;
        drawingComponent.xg2 = x2;
        drawingComponent.yg2 = y2;
        drawingComponent.ng2 = n2;
        jcp.add(drawingComponent, BorderLayout.CENTER);
        jcp.setBackground(Color.gray);
        setSize(1200, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void Print(WritableRaster raster){
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < raster.getWidth() - 1; j++) {
                if (raster.getWidth() - 1 == j + 1){
                    System.out.print(raster.getSample(j, i, 0));
                }
                else{
                    System.out.print(raster.getSample(j, i, 0) + ", ");
                }
            }
            System.out.println();
        }
    }
}
