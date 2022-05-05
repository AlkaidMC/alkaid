/*
 * Copyright 2022 Alkaid
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *           http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alkaidmc.alkaid.bukkit.command;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.bukkit.command.CommandMap;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@SuppressWarnings("unused")
public class ParseCommandRegister {
    final JavaPlugin plugin;
    final PluginCommand instance;
    final CommandMap commands;

    // 命令相关信息 / Command information
    @Setter
    @Getter
    @Accessors(fluent = true, chain = true)
    String command;
    @Setter
    @Getter
    @Accessors(fluent = true, chain = true)
    List<String> aliases = new ArrayList<>();
    @Setter
    @Getter
    @Accessors(fluent = true, chain = true)
    String description;
    @Setter
    @Getter
    @Accessors(fluent = true, chain = true)
    String usage;
    @Setter
    @Getter
    @Accessors(fluent = true, chain = true)
    String permission;
}