package jiao.service;

import java.io.File;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FileRenamer {
    private static final SecureRandom random = new SecureRandom();
    private static final int DIGITS_COUNT = 200;

    private static final String folderPath = "G:/火狐下载/图片暂存处/"; // 替换为你的实际文件夹路径

    public static void main(String[] args) {


        List<String> heads = new ArrayList<String>() {{
            add("壁纸");
            add("桌面");
            add("表情");
        }};

        for (String head : heads) {
            renameFile(head);
        }
    }


    private static void renameFile(String head) {
        File folder = new File(folderPath + head);
        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("指定的文件夹不存在或不是目录！");
            return;
        }

        // 遍历文件夹中的所有文件
        for (File file : Objects.requireNonNull(folder.listFiles())) {
            if (file.isFile()) {
                renameFile(file, head);
            }
        }

        System.out.println(head + "文件重命名完成！");
    }

    private static void renameFile(File file, String head) {
        // 获取文件扩展名
        String fileName = file.getName();
        String extension = "";
        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex > 0) {
            extension = fileName.substring(dotIndex);
        }

        // 生成200位随机数字
        StringBuilder randomDigits = new StringBuilder(DIGITS_COUNT);
        for (int i = 0; i < DIGITS_COUNT; i++) {
            randomDigits.append(random.nextInt(10));
        }

        // 构建新文件名
        String newFileName = head + randomDigits + extension;
        File newFile = new File(file.getParent(), newFileName);

        // 重命名文件
        if (file.renameTo(newFile)) {
            System.out.println("重命名成功: " + fileName + " -> " + newFileName);
        } else {
            System.out.println("重命名失败: " + fileName);
        }
    }
}
